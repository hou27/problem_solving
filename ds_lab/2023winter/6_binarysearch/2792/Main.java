import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 아이들의 수
        int M = sc.nextInt(); // 색상의 수
        int[] colors = new int[M];

        for (int i = 0; i < M; i++) {
            colors[i] = sc.nextInt();
        }

        Arrays.sort(colors); // 오름차순 정렬

        int left = 1;
        int right = colors[M - 1]; // 가장 큰 값
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2; // 나눠줄 보석 수
            int cnt = 0;

            for (int i = 0; i < M; i++) {
                cnt += colors[i] / mid; // 나눠줄 보석 수에 해당하는 아이들 수
                if (colors[i] % mid != 0) { // 나눠떨어지지 않는 경우
                    cnt++; // 남은 한 사람에게 나머지를 준 것으로 가정
                }
            }

            if (cnt <= N) { // 아이들 수보다 작거나 같은 경우
                result = mid; // 결과값 갱신
                right = mid - 1; // 더 작은 값으로 탐색
            } else { // 아이들 수보다 큰 경우
                left = mid + 1; // 더 큰 값으로 탐색
            }
        }

        System.out.println(result);

        sc.close();
    }
}
