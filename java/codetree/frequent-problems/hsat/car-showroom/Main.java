import java.util.*;

public class Main {
    static int n, m, k;
    static int[][] mem;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static int[] startPoints;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        mem = new int[n + 1][k];
        for (int i = 1; i < n + 1; i++) {
            for (int p = 0; p < k; p++) {
                mem[i][p] = 100001;
            }
        }

        // edges = new int[m][2];
        for (int i = 0; i < n + 1; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int dst = sc.nextInt();
            edges.get(src).add(dst);
        }

        startPoints = new int[k];
        for (int i = 0; i < k; i++) {
            startPoints[i] = sc.nextInt();
            mem[startPoints[i]][i] = 0;
            // System.out.println("mem[" + startPoints[i] + "][" + i + "]");
            bfs(startPoints[i], i);
        }

        sc.close();
        // Please write your code here.

        System.out.println(getAnswer());
    }

    private static void bfs(int startPoint, int startPointIdx) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        queue.add(new int[] { startPoint, 0 });

        // System.out.println("startPointIdx: " + startPointIdx + ", startPoint: " +
        // startPoint);
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currPoint = curr[0];
            int currTime = curr[1];
            if (visited[currPoint]) {
                continue;
            }
            visited[currPoint] = true;
            mem[currPoint][startPointIdx] = currTime;
            // System.out.println("currPoint: " + currPoint + ", currTime: " + currTime);

            for (int nei : edges.get(currPoint)) {
                if (visited[nei]) {
                    continue;
                }
                queue.add(new int[] { nei, currTime + 1 });
            }
        }
    }

    private static int getAnswer() {
        int min = 100001;

        for (int i = 1; i < n + 1; i++) {
            int currMax = getMaxElement(mem[i], k);
            if (currMax == -1) {
                continue;
            }

            if (min > currMax) {
                min = currMax;
            }
        }

        if (min == 100001) {
            return -1;
        }

        return min;
    }

    private static int getMaxElement(int[] arr, int size) {
        int value = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 100001) {
                return -1;
            }
            if (value < arr[i]) {
                value = arr[i];
            }
        }

        return value;
    }
}