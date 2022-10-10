package java.elice.가장_작은_수;

import java.util.*;

public class Main {
  public static void solve(int[] n) {
    /* 여기에 코드를 작성해 주세요 */
    System.out.println(Arrays.stream(n).min().getAsInt());
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String strs[] = str.split("\\s");
    int n[] = new int[strs.length];

    for (int i = 0; i < n.length; i++) {
      n[i] = Integer.parseInt(strs[i]);
    }

    sc.close();

    solve(n);
  }
}
