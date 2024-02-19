import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // A의 수
            int M = sc.nextInt(); // B의 수
            int[] A = new int[N];
            int[] B = new int[M];
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt(); // A의 각 크기 입력받기
            }
            for (int j = 0; j < M; j++) {
                B[j] = sc.nextInt(); // B의 각 크기 입력받기
            }

            // A, B 오름차순 정렬
            Arrays.sort(A);
            Arrays.sort(B);

            for (int k = N - 1; k >= 0; k--) {
                if (A[k] <= B[0]) {
                    break;
                }

                for (int l = 0; l < M; l++) {
                    if (A[k] > B[l]) {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}
