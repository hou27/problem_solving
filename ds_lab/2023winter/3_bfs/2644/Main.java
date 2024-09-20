import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 전체 사람 수

        // 촌수를 계산해야 하는 서로 다른 두 사람의 번호
        int a = sc.nextInt();
        int b = sc.nextInt();

        int m = sc.nextInt(); // 부모 자식들 간의 관계의 개수
        int[][] A = new int[n][n]; // 인접 행렬
        int[] visited = new int[n]; // 방문 여부
        int[] numberOfRelatives = new int[n]; // 촌수

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            A[u][v] = 1;
            A[v][u] = 1;
        }

        // BFS는 큐를 사용하는 것이 정석
        Queue<Integer> q = new LinkedList<>();
        q.add(a - 1); // 시작점을 큐에 넣고
        visited[a - 1] = 1; // 방문 표시
        numberOfRelatives[a - 1] = 0; // 시작점으로부터의 촌수 기록

        while (!q.isEmpty()) {
            int v = q.remove(); // 큐에서 하나 꺼냄
            for (int i = 0; i < n; i++) {
                if (A[v][i] == 1 && visited[i] == 0) { // 인접하고 방문하지 않았다면
                    q.add(i); // 큐에 넣고
                    visited[i] = 1; // 방문 표시
                    numberOfRelatives[i] = numberOfRelatives[v] + 1; // 촌수 기록
                }
            }
        }

        if (numberOfRelatives[b - 1] == 0) { // 친척 관계 없는 경우
            System.out.println(-1);
        } else {
            System.out.println(numberOfRelatives[b - 1]);
        }

        sc.close();
    }
}