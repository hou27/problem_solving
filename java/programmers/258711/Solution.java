import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> nodeSet = new HashSet<>();
        Set<Integer> sourceNodeSet = new HashSet<>();
        Set<Integer> targetNodeSet = new HashSet<>();

        for (int[] edge : edges) {
            if (graph.get(edge[0]) == null) {
                graph.put(edge[0], new ArrayList<>());
            }
            graph.get(edge[0]).add(edge[1]);
            sourceNodeSet.add(edge[0]);
            targetNodeSet.add(edge[1]);
            nodeSet.add(edge[0]);
            nodeSet.add(edge[1]);
        }

        int max = 0;
        int generatedVertex = 0;
        Set<Integer> candidates = new HashSet<>(sourceNodeSet);
        candidates.removeAll(targetNodeSet);

        for (int node : candidates) {
            if (graph.get(node) != null && max < graph.get(node).size()) {
                max = graph.get(node).size();
                generatedVertex = node;
            }
        }

        boolean[] visited = new boolean[nodeSet.size() + 1];
        visited[generatedVertex] = true;
        int[] result = new int[] { generatedVertex, 0, 0, 0 };
        for (int i : graph.get(generatedVertex)) {
            int flag = dfs(graph, visited, i);
            result[flag]++;
        }

        return result;
    }

    static int dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int startnode) {
        Stack<Integer> stack = new Stack<>();
        // int flag = 0; // 도넛 모양 그래프, 막대 모양 그래프, 8자 모양 그래프
        stack.push(startnode);

        while (!stack.isEmpty()) {
            int curr = stack.pop();

            if (visited[curr]) {
                continue;
            }
            visited[curr] = true;

            if (graph.get(curr) == null) {
                return 2;
            }

            if (graph.get(curr).size() >= 2) {
                return 3;
            }

            for (int neighbor : graph.get(curr)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }

        return 1;
    }
}

/**
 * 과거 버전
 */
// import java.util.*;

// class Solution {
// public int[] solution(int[][] edges) {
// int[] answer = { 0, 0, 0, 0 };
// Set<Integer> uniqueSourceNodes = new HashSet<>();
// Set<Integer> uniqueTargetNodes = new HashSet<>();
// // List<List<Integer>> edgeIndexs = new ArrayList<>();
// // edgeIndexs를 map으로 선언
// Map<Integer, List<Integer>> edgeIndexs = new HashMap<>();

// for (int[] edge : edges) {
// uniqueSourceNodes.add(edge[0]);
// uniqueTargetNodes.add(edge[1]);
// }
// Set<Integer> uniqueNodes = new HashSet<>();
// uniqueNodes.addAll(uniqueSourceNodes);
// uniqueNodes.addAll(uniqueTargetNodes);

// // for (int i = 0; i < uniqueNodes.size() + 1; i++) {
// // edgeIndexs.add(new ArrayList<Integer>());
// // }

// // for (int[] edge : edges) {
// // edgeIndexs.get(edge[0]).add(edge[1]);
// // }
// for (int[] edge : edges) {
// if (edgeIndexs.get(edge[0]) == null) {
// edgeIndexs.put(edge[0], new ArrayList<>());
// }
// edgeIndexs.get(edge[0]).add(edge[1]);
// }

// uniqueSourceNodes.removeAll(uniqueTargetNodes);

// // 가장 많은 나가는 간선을 가진 uniqueSourceNodes 내의 노드를 선정
// int max = 0;
// int maxNode = 0;
// for (int exceptedNode : uniqueSourceNodes) {
// if (edgeIndexs.get(exceptedNode).size() > max) {
// max = edgeIndexs.get(exceptedNode).size();
// maxNode = exceptedNode;
// }
// }

// // int[] visited = new int[uniqueNodes.size() + 1];
// // visited를 map으로 선언
// Map<Integer, Integer> visited = new HashMap<>();
// answer[0] = maxNode;

// for (int i : edgeIndexs.get(maxNode)) {
// int flag = dfs(edgeIndexs, visited, i, uniqueNodes.size());
// answer[flag]++;
// }

// return answer;
// }

// public static int dfs(Map<Integer, List<Integer>> edgeIndexs, Map<Integer,
// Integer> visited, int node,
// int nodeCnt) {
// Stack<Integer> stack = new Stack<>();
// stack.push(node);
// int flag = 2; // donut, stick, 8

// while (!stack.isEmpty()) {
// int current = stack.pop();
// // if (visited[current] == 0) {
// if (visited.get(current) == null) {
// // visited[current] = 1;
// visited.put(current, 1);
// if (edgeIndexs.get(current) == null) {
// flag = 2;
// continue;
// }
// if (edgeIndexs.get(current).size() >= 2) {
// flag = 3; // 나가는 간선이 2개 이상이면 도넛이나 막대는 아니다.
// }
// else {
// for (int neighbor : edgeIndexs.get(current)) {
// // if (visited[neighbor] == 1) {
// if (visited.get(neighbor) != null) {
// if (flag != 3) {
// flag = 1; // 갔던 곳을 다시 또 가는 경우는 도넛 또는 8자 그래프
// }
// // } else if (visited[neighbor] == 0) {
// } else {
// stack.push(neighbor);
// }
// }
// }

// }
// }

// return flag;
// }
// }