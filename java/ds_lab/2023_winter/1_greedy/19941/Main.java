import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람 수
        int K = sc.nextInt(); // 햄버거 수
        String info = sc.next();
        
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (info.charAt(i) == 'P') {
                for (int j = i - K; j <= i + K; j++) {
                    if (j < 0 || j >= N) continue;
                    if (info.charAt(j) == 'H') {
                        cnt++;
                        // 햄버거를 먹음 표시
                        info = info.substring(0, j) + 'X' + info.substring(j + 1);
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
    
}
