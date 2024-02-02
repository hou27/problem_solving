import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 순열의 크기
            int[][] A = new int[N + 1][N + 1];
            int[] arr = new int[N + 1];
            boolean[] visited = new boolean[N + 1];
            for (int j = 1; j <= N; j++) {
                arr[j] = sc.nextInt();
                A[j][arr[j]] = 1;
                A[arr[j]][j] = 1;
            }
            int cnt = 0;
            Stack<Integer> stack = new Stack<>();
            for (int j = 1; j <= N; j++) {
                if (!visited[j]) {
                    stack.push(j);
                    dfs(stack, j, A, visited);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }
    
    public static void dfs(Stack<Integer> stack, int idx, int[][] A, boolean[] visited) {
        visited[idx] = true;
        while (!stack.empty()) {
            stack.pop();
            for (int k = 1; k < A.length; k++) {
                if(!visited[k] && A[idx][k] == 1) {
                    stack.push(k);
                    dfs(stack, k, A, visited);
                }
            }
        }
    }
}
