package java.elice.엘리스와_이상한_상자;

import java.util.*;

class maxMachine {
  private final List<Integer> list;

  public maxMachine() {
    /* 여기에 코드를 작성해 주세요 */
    list = new ArrayList<>();
  }

  public void addNumber(int n) {
    /* 여기에 코드를 작성해 주세요 */
    list.add(n);
  }

  public void removeNumber(int n) {
    /* 여기에 코드를 작성해 주세요 */
    list.remove(Integer.valueOf(n));
  }

  public int getMax() {
    /* 여기에 코드를 작성해 주세요 */
    if (list.isEmpty())
      return -1;
    return Collections.max(list);
  }
}

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    maxMachine machine = new maxMachine();

    for (int i = 0; i < n; i++) {
      int t;
      t = sc.nextInt();
      switch (t) {
        case 0:
          machine.addNumber(sc.nextInt());
          break;
        case 1:
          machine.removeNumber(sc.nextInt());
          break;
        case 2:
          System.out.println(machine.getMax());
          break;
      }
    }

    sc.close();
  }
}
