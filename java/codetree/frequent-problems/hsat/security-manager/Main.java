import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        sc.close();
        // Please write your code here.

        if (N % 2 != 0 || S.charAt(N - 1) == '(') {
            System.out.println("No");
            return;
        }

        int[] acc = { 0, 0, 0 }; // (, ), ?

        for (int i = 0; i < N; i++) {
            switch (S.charAt(i)) {
                case '(':
                    acc[0]++;
                    break;
                case ')':
                    if (acc[0] - acc[1] >= 1) {
                        acc[1]++;
                    } else if (acc[2] > 0) {
                        acc[0]++;
                        acc[1]++;
                        acc[2]--;
                    } else {
                        System.out.println("No");
                        return;
                    }
                    break;
                case '?':
                    acc[2]++;
                    break;
                default:
                    break;
            }
        }

        if (acc[0] <= N / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}