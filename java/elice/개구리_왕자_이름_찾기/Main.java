package java.elice.개구리_왕자_이름_찾기;

import java.util.*;

public class Main {
  static String isPrince(String frogs[]) {
    for (int i = 0; i < frogs.length; i++) {
      if (frogs[i].charAt(0) == 'F')
        return frogs[i];
    }
    return null;
  }

  public static void main(String args[]) {
    int frogCount;
    String frogs[];
    int i;
    Scanner sc = new Scanner(System.in);

    frogCount = Integer.parseInt(sc.nextLine());
    frogs = new String[frogCount];
    for (i = 0; i < frogCount; i++) {
      frogs[i] = sc.nextLine();
    }

    System.out.println(isPrince(frogs));

    sc.close();
  }
}