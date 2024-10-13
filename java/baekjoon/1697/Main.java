import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        sc.close();

        System.out.println(bfs(N, K));

    }

    public static int bfs(int start, int dest) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { start, 0 });
        boolean[] visited = new boolean[100001];
        int[] d = { -1, +1 };
        int answer = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int loc = curr[0];
            int step = curr[1];
            if (loc == dest) {
                answer = step;
                break;
            }

            if (visited[loc]) {
                continue;
            }
            visited[loc] = true;

            for (int i = 0; i < 3; i++) {
                int nloc;
                if (i == 2) {
                    nloc = loc * 2;
                } else {
                    nloc = loc + d[i];
                }

                if (nloc > 100000 || nloc < 0 || visited[nloc]) {
                    continue;
                }
                queue.add(new int[] { nloc, step + 1 });
            }

        }

        return answer;
    }

}
