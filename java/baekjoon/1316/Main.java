import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      String word = sc.next();
      if (check(word)) {
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }

  private static boolean check(String word) {
    boolean[] check = new boolean[26]; // 알파벳 체크
    int prev_char = 0; // 이전 알파벳
    for (int i = 0; i < word.length(); i++) { // 단어의 길이만큼 반복
      int curr_char = word.charAt(i);
      if (prev_char != curr_char) {
        if (!check[curr_char - 'a']) {
          check[curr_char - 'a'] = true;
          prev_char = curr_char;
        } else {
          return false;
        }
      }
    }

    return true;
  }

}
