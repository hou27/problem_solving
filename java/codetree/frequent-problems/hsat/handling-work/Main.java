import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int leafCount = (int) Math.pow(2, H);
        int[] tasks = new int[leafCount * K];
        for (int i = 0; i < leafCount; i++) {
            for (int j = 0; j < K; j++) {
                int task = sc.nextInt();
                tasks[i * K + j] = task;
                /**
                 * 말단 직원들의 첫번째 업무가 부서장에 의해 처리되는 순서 규칙 (저 순서가 한번 돌면 각 idx에 1을 더하면 그대로 다음 턴이 돌아간다)
                 * K 0 (H = 1)
                 * K 3K 0 2K (H = 2)
                 * 5K K 7K 3K 4K 0 6K 2K (H = 3)
                 * 5K 13K K 9K 7K 15K 3K 11K 4K 12K 0 8K 6K 14K 2K 10K (H = 4)
                 * ...
                 */
            }
        }

        sc.close();
        // Please write your code here.

        if (R <= H) {
            System.out.println(0);
            return;
        }

        long result = 0;

        if (R - H >= leafCount * K) {
            for (int task : tasks) {
                result += task;
            }
            System.out.println(result);
            return;
        }

        int[] order = buildOrder(H, leafCount);

        for (int t = 0; t < R - H; t++) {
            int leafIdx = order[t % leafCount];
            int personalOrder = t / leafCount; // 말단의 몇 번째 업무인지
            result += tasks[leafIdx * K + personalOrder];
        }

        System.out.println(result);
    }

    private static int[] buildOrder(int H, int leafCount) {
        if (H == 1) {
            return new int[] {1, 0};
        }

        int[] prev = buildOrder(H - 1, leafCount / 2);
        int[] cur = new int[prev.length * 2];
        int add = leafCount / 2;

        int idx = 0;
        for (int v : prev) {
            // H 홀짝에 따라서 확장되는 idx의 위치가 서로 다름
            if (H % 2 == 0) {
                cur[idx++] = v;
                cur[idx++] = v + add;
            } else {
                cur[idx++] = v + add;
                cur[idx++] = v;
            }
        }

        return cur;
    }
}
