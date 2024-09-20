import java.util.*;

public class Main {
    static int happiness = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점 개수
        int M = sc.nextInt(); // 문자열 길이
        String S = sc.next(); // 문자열
        // 문자열 배열화
        String[] lcs = S.split("");
        int[] visited = new int[N]; // 방문 여부

        // 인접행렬
        String[][] A = new String[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(A[i], null);
        }

        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            String c = sc.next();
            A[u - 1][v - 1] = c;
            A[v - 1][u - 1] = c;
        }

        int idx = 0;
        for (int i = 0; i < N; i++) {
            if (visited[i] == 0) { // 방문하지 않았다면
                dfs(i, A, lcs, idx, visited, 0, ""); // DFS
            }
        }

        System.out.println(happiness);

        sc.close();
    }

    public static void dfs(int v, String[][] A, String[] lcs, int idx, int[] visited, int currentHappiness,
            String currentString) {
        visited[v] = 1; // 방문 표시
        for (int i = 0; i < A.length; i++) {
            if (A[v][i] != null && visited[i] == 0) { // 인접하고 방문하지 않았다면
                currentString += A[v][i];
                dfs(i, A, lcs, idx, visited, currentHappiness, currentString); // DFS
                currentString = currentString.substring(0, currentString.length() - 1);
            }
        }
        if (currentString.length() > happiness) {
            String[] chars = currentString.split("");
            happiness = Math.max(LCS(chars, lcs), happiness);
        }
    }

    public static int LCS(String[] currentString, String[] lcs) {
        int[][] dp = new int[currentString.length + 1][lcs.length + 1];
        for (int i = 1; i <= currentString.length; i++) {
            for (int j = 1; j <= lcs.length; j++) {
                if (currentString[i - 1].equals(lcs[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[currentString.length][lcs.length];
    }
}
