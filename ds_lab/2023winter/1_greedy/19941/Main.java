import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람 수
        int K = sc.nextInt(); // 햄버거 수
        StringBuilder info = new StringBuilder(sc.next());
        
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (info.charAt(i) == 'P') {
                for (int j = Math.max(0, i - K); j <= Math.min(N - 1, i + K); j++) { // 코드 개선
                    if (info.charAt(j) == 'H') {
                        cnt++;
                        // 햄버거를 먹음 표시
                        info.setCharAt(j, 'X'); // StringBuilder 활용
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
