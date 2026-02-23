import java.util.*;

public class Main {
    static int n, m, S, T;
    static List<List<Integer>> edges = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            edges.get(x).add(y);
        }
        S = sc.nextInt();
        T = sc.nextInt();

        sc.close();
        // Please write your code here.

        // 가는 길에 방문 가능한 모든 노드 적립
        boolean[] sToT = getReachableSet(S, T);
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + ": " + sToT[i] + " ");
        }
        System.out.println();

        // 오는 길에 방문 가능한 모든 노드 적립
        boolean[] tToS = getReachableSet(T, S);
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + ": " + tToS[i] + " ");
        }
        System.out.println();

        // 둘의 교집합 크기 반환
        int cnt = 0;
        for (int v = 1; v <= n; v++) {
            if (v == S || v == T) {
                continue;
            }
            if (sToT[v] && tToS[v]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean[] getReachableSet(int startVertex, int endVertex) {
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
