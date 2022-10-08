package java.elice.개굴개굴_개구리;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 여기에 코드를 작성해 주세요 */
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        char[] chars = line.toCharArray();

        for (int i = 0; i < line.length(); i++) {
            if (chars[i] == ' ')
                System.out.print(" ");
            else
                System.out.print("개굴");
        }

        sc.close();
    }
}
