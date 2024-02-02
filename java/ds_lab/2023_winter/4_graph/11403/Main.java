import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        int[][] result = new int[N][N];

        // 방향성이 있는 edge
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 각 정점에 대해 0으로 표시되어있는 정점까지의 경로가 있는지 체크
        for (int i = 0; i < N; i++) {
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[N];
            stack.push(i);
            search(stack, i, A, visited, i, result);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
        

        sc.close();
    }

    public static void search(Stack<Integer> stack, int idx, int[][] A, boolean[] visited, int start, int[][] result) {
        visited[idx] = true;
        if (start != idx)
            result[start][idx] = 1;        
        while (!stack.empty()) {
            stack.pop();
            for (int k = 0; k < A.length; k++) {
                if (start == k && A[idx][k] == 1) {
                    result[start][start] = 1;   
                }
                if(!visited[k] && A[idx][k] == 1) {
                    stack.push(k);
                    search(stack, k, A, visited, start, result);
                }
            }
        }
    }
}
