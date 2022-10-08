package java.elice.접미사_배열;

import java.util.*;

public class Main {
  public static void solve(String str) {
    /* 여기에 코드를 작성해 주세요 */
    List<String> suffixs = new ArrayList<>();
    for (int i = str.length(); i > 0; i--) {
      suffixs.add(str.substring(i - 1, str.length()));
    }
    Collections.sort(suffixs);
    for (String suffix : suffixs) {
      System.out.println(suffix);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    solve(str);

    sc.close();
  }
}
