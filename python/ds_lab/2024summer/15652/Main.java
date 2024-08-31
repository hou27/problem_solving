import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        sc.close();

        dfs(N, M);
    }

    public static void dfs(int N, int M) {
        Stack<String> stack = new Stack<>();

        for (int i = N; i >= 1; i--) {
            stack.push(String.valueOf(i));
        }

        while (!stack.isEmpty()) {
            String curr = stack.pop();

            if (curr.length() < M * 2 - 1) {
                for (int i = N; i >= Integer.parseInt(curr.substring(curr.length() - 1)); i--) {
                    stack.push(curr + " " + i);
                }
            } else {
                System.out.println(curr);
            }
        }
    }
}
