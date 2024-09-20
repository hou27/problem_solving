import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int[][] A = new int[N][N]; // 인접 행렬
        int[] visited = new int[N]; // 방문 여부
        int cnt = 0; // 연결 요소의 개수

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt() - 1; // 정점 번호는 1을 빼줌
            int v = sc.nextInt() - 1;
            A[u][v] = 1;
            A[v][u] = 1;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] == 0) { // 방문하지 않았다면
                cnt++; // 연결 요소의 개수 증가
                dfs(i, A, visited); // DFS
            }
        }

        System.out.println(cnt);

        sc.close();
    }
    
    public static void dfs(int v, int[][] A, int[] visited) {
        visited[v] = 1; // 방문 표시
        for (int i = 0; i < A.length; i++) {
            if (A[v][i] == 1 && visited[i] == 0) { // 인접하고 방문하지 않았다면
                dfs(i, A, visited); // DFS
            }
        }
    }
}
