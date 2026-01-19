import java.util.*;

public class Main {
    static int N, K;
    static int[] positions;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        positions = new int[N];
        for (int i = 0; i < N; i++) {
            positions[i] = sc.nextInt();
        }
        int initialLength = (int) Math.ceil((double) N / K);

        sc.close();
        // Please write your code here.

        if (K == 1) {
            System.out.println(positions[N - 1] - positions[0] + 1);
            return;
        } else {
            for (int i = 0; initialLength + i < positions[N - 1] - positions[0] + 1; i++) {
                if (check(initialLength + i)) {
                    System.out.println(initialLength + i);
                    return;
                }
                return;
            }
        }
    }

    private static boolean check(int len) {
        System.out.println("Length: " + len);
        int pos = positions[0];
        int posIdx = 1;

        for (int k = 0; k < K; k++) {
            System.out.println("pos: " + pos);
            pos += len;

            while (!(posIdx >= N || pos <= positions[posIdx])) {
                posIdx++;
                System.out.println("pos: " + pos + ", posIdx: " + posIdx);
            }
            if (posIdx == N) {
                return true;
            }
            pos = positions[posIdx];
            posIdx++;
            System.out.println("OUTER:: pos: " + pos + ", posIdx: " + posIdx);
        }

        if (posIdx > N) {
            return true;
        }
        return false;
    }
}