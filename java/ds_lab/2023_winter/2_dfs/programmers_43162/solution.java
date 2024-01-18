class Solution {
    public int solution(int n, int[][] computers) {
        int cnt = 0; // 네트워크 개수
        int[] visited = new int[n]; // 방문 여부

        // 인접행렬화 하기 위해 대각 성분 제거
        for (int i = 0; i < n; i++) {
            computers[i][i] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) { // 방문하지 않았다면
                cnt++; // 네트워크 개수 증가
                dfs(i, computers, visited); // DFS
            }
        }

        return cnt;
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