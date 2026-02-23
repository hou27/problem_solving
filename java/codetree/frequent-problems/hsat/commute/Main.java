import java.util.*;

public class Main {
    static int n, m, S, T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        List<List<Integer>> edges = new ArrayList<>();
        List<List<Integer>> reverseEdges = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
            reverseEdges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            edges.get(x).add(y);
            reverseEdges.get(y).add(x);
        }
        S = sc.nextInt();
        T = sc.nextInt();

        sc.close();
        // Please write your code here.

        // 가는 길에 방문 가능한 모든 노드 적립
        boolean[] sToMid = getReachableSet(S, T, edges);
        boolean[] midToT = getReachableSet(T, S, reverseEdges);
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + ": " + sToMid[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + ": " + midToT[i] + " ");
        }
        System.out.println();
        System.out.println();

        // 오는 길에 방문 가능한 모든 노드 적립
        boolean[] tToMid = getReachableSet(T, S, edges);
        boolean[] midToS = getReachableSet(S, T, reverseEdges);
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + ": " + tToMid[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + ": " + midToS[i] + " ");
        }
        System.out.println();

        // 둘의 교집합 크기 반환
        int cnt = 0;
        for (int v = 1; v <= n; v++) {
            if (v == S || v == T) {
                continue;
            }
            if (sToMid[v] && midToT[v] && tToMid[v] && midToS[v]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean[] getReachableSet(int startVertex, int endVertex, List<List<Integer>> edges) {
        boolean[] visited = new boolean[n + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (cur == endVertex) {
                continue;
            }

            for (int next : edges.get(cur)) {
                if (visited[next]) {
                    continue;
                }
                visited[next] = true;
                queue.add(next);
            }
        }

        return visited;
    }
}
