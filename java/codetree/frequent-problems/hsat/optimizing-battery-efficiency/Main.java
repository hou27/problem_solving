import java.util.*;

public class Main {
    static int N, M;
    static boolean[][] selected;
    static Set<Integer> shapes = new HashSet<>();
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new boolean[N][M];
        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // Please write your code here.

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                selected[x][y] = true;
                dfs(1);
                selected[x][y] = false;
            }
        }

        // 준비된 모든 case들을 사용하여 겹치는 칸이 2개인 것들을 식별하고 그 중 가장 높은 효율을 뽑아내는 것을 선정
        List<Integer> shapeList = new ArrayList<>(shapes);
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < shapeList.size(); i++) {
            int a = shapeList.get(i);
            for (int j = 1; j < shapeList.size(); j++) {
                int b = shapeList.get(j);
                // System.out.println("a: " + a + ", b: " + b);
                if (Integer.bitCount(a & b) == 2) {
                    int currResult = decode(a) + decode(b); // 자연스레 겹친 칸은 두번 계산되어 점수가 2배가 됨
                    // System.out.println(currResult);
                    result = result > currResult ? result : currResult;
                }
            }
        }

        System.out.println(result);
    }

    static void dfs(int cnt) {
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };

        if (cnt == 5) {
            shapes.add(encode());
            return;
        }

        // 현재 선택된 모든 칸을 기준으로 확장할 후보를 고려
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (!selected[x][y])
                    continue;

                for (int i = 0; i < 4; i++) { // 선택된 것 기준 모든 방향 고려
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (!(nx >= 0 && nx < N && ny >= 0 && ny < M) || selected[nx][ny])
                        continue;

                    selected[nx][ny] = true;
                    dfs(cnt + 1);
                    selected[nx][ny] = false;
                }
            }
        }
    }

    static int encode() {
        int mask = 0;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (selected[x][y]) {
                    mask |= 1 << (x * M + y); // 반드시 모든 값이 unique하도록
                }
            }
        }
        return mask; // 결과적으로 1이 5개인 이진수가 만들어짐
    }

    static int decode(int mask) {
        int acc = 0;
        for (int i = 0; i < N * M; i++) {
            if ((mask & (1 << i)) != 0) {
                acc += board[i / M][i % M];
            }
        }

        return acc;
    }
}