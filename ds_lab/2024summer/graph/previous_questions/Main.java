import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = { 0, 0, 0, 0 };
        Set<Integer> uniqueSourceNodes = new HashSet<>();
        Set<Integer> uniqueTargetNodes = new HashSet<>();
        // List<List<Integer>> edgeIndexs = new ArrayList<>();
        // edgeIndexs를 map으로 선언
        Map<Integer, List<Integer>> edgeIndexs = new HashMap<>();

        for (int[] edge : edges) {
            uniqueSourceNodes.add(edge[0]);
            uniqueTargetNodes.add(edge[1]);
        }
        Set<Integer> uniqueNodes = new HashSet<>();
        uniqueNodes.addAll(uniqueSourceNodes);
        uniqueNodes.addAll(uniqueTargetNodes);

        // for (int i = 0; i < uniqueNodes.size() + 1; i++) {
        // edgeIndexs.add(new ArrayList<Integer>());
        // }

        // for (int[] edge : edges) {
        // edgeIndexs.get(edge[0]).add(edge[1]);
        // }
        for (int[] edge : edges) {
            if (edgeIndexs.get(edge[0]) == null) {
                edgeIndexs.put(edge[0], new ArrayList<>());
            }
            edgeIndexs.get(edge[0]).add(edge[1]);
        }

        uniqueSourceNodes.removeAll(uniqueTargetNodes);

        // 가장 많은 나가는 간선을 가진 uniqueSourceNodes 내의 노드를 선정
        int max = 0;
        int maxNode = 0;
        for (int exceptedNode : uniqueSourceNodes) {
            if (edgeIndexs.get(exceptedNode).size() > max) {
                max = edgeIndexs.get(exceptedNode).size();
                maxNode = exceptedNode;
            }
        }

        // int[] visited = new int[uniqueNodes.size() + 1];
        // visited를 map으로 선언
        Map<Integer, Integer> visited = new HashMap<>();
        answer[0] = maxNode;

        for (int i : edgeIndexs.get(maxNode)) {
            int flag = dfs(edgeIndexs, visited, i, uniqueNodes.size());
            answer[flag]++;
        }

        return answer;
    }

    public static int dfs(Map<Integer, List<Integer>> edgeIndexs, Map<Integer, Integer> visited, int node,
            int nodeCnt) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        int flag = 2; // donut, stick, 8

        while (!stack.isEmpty()) {
            int current = stack.pop();
            // if (visited[current] == 0) {
            if (visited.get(current) == null) {
                // visited[current] = 1;
                visited.put(current, 1);
                if (edgeIndexs.get(current) == null) {
                    flag = 2;
                    continue;
                }
                for (int neighbor : edgeIndexs.get(current)) {
                    // if (visited[neighbor] == 1) {
                    if (visited.get(neighbor) != null) {
                        if (flag != 3) {
                            flag = 1; // 갔던 곳을 다시 또 가는 경우는 도넛 또는 8자 그래프
                        }
                        // } else if (visited[neighbor] == 0) {
                    } else {
                        stack.push(neighbor);
                    }
                }
                if (edgeIndexs.get(current).size() >= 2) {
                    flag = 3; // 나가는 간선이 2개 이상이면 도넛이나 막대는 아니다.
                }
            }
        }

        return flag;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // [[4, 11], [1, 12], [8, 3], [12, 7], [4, 2], [7, 11], [4, 8], [9, 6], [10,
        // 11], [6, 10], [3, 5], [11, 1], [5, 3], [11, 9], [3, 8]]
        int[][] edges = { { 4, 11 }, { 1, 12 }, { 8, 3 }, { 12, 7 }, { 4, 2 }, { 7, 11 }, { 4, 8 }, { 9, 6 },
                { 10, 11 },
                { 6, 10 }, { 3, 5 }, { 11, 1 }, { 5, 3 }, { 11, 9 }, { 3, 8 } };
        int[] answer = solution.solution(edges);
        System.out.print("[");
        for (int n : answer) {
            System.out.print(n + ", ");
        }
        System.out.println("]");

        // [[2, 3], [4, 3], [1, 1], [2, 1]]
        int[][] edges2 = { { 2, 7 }, { 4, 7 }, { 1, 1 }, { 2, 1 } };
        int[] answer2 = solution.solution(edges2);
        System.out.print("[");
        for (int n : answer2) {
            System.out.print(n + ", ");
        }
        System.out.println("]");
    }
}