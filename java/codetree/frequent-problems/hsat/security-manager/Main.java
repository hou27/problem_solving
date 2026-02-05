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

        int min = 0;
        int max = 0; // range of people allowed in the office

        for (int i = 0; i < N; i++) {
            switch (S.charAt(i)) {
                case '(':
                    min++;
                    max++;
                    break;
                case ')':
                    min--;
                    max--;
                    break;
                case '?':
                    min--;
                    max++;
                    break;
                default:
                    break;
            }

            if (max < 0) {
                System.out.println("No");
                return;
            }

            if (min < 0) {
                min = 0;
            }
        }

        if (min == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}