import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 두 종류의 부등호 기호 ‘<’와 ‘>’가 k개 나열된 순서열 A가 있다. 우리는 이 부등호 기호 앞뒤에 서로 다른 한 자릿수 숫자를 넣어서
 * 모든 부등호 관계를 만족시키려고 한다. 예를 들어, 제시된 부등호 순서열 A가 다음과 같다고 하자.
 * 
 * A ⇒ < < < > < < > < >
 * 
 * 부등호 기호 앞뒤에 넣을 수 있는 숫자는 0부터 9까지의 정수이며 선택된 숫자는 모두 달라야 한다. 아래는 부등호 순서열 A를 만족시키는
 * 한 예이다.
 * 
 * 3 < 4 < 5 < 6 > 1 < 2 < 8 > 7 < 9 > 0
 * 
 * 이 상황에서 부등호 기호를 제거한 뒤, 숫자를 모두 붙이면 하나의 수를 만들 수 있는데 이 수를 주어진 부등호 관계를 만족시키는 정수라고
 * 한다. 그런데 주어진 부등호 관계를 만족하는 정수는 하나 이상 존재한다. 예를 들어 3456128790 뿐만 아니라 5689023174도
 * 아래와 같이 부등호 관계 A를 만족시킨다.
 * 
 * 5 < 6 < 8 < 9 > 0 < 2 < 3 > 1 < 7 > 4
 * 
 * 여러분은 제시된 k개의 부등호 순서를 만족하는 (k+1)자리의 정수 중에서 최댓값과 최솟값을 찾아야 한다. 앞서 설명한 대로 각 부등호의
 * 앞뒤에 들어가는 숫자는 { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }중에서 선택해야 하며 선택된 숫자는 모두 달라야 한다.
 * 
 * 첫 줄에 부등호 문자의 개수를 나타내는 정수 k가 주어진다. 그 다음 줄에는 k개의 부등호 기호가 하나의 공백을 두고 한 줄에 모두
 * 제시된다. k의 범위는 2 ≤ k ≤ 9 이다.
 */

public class Main {
  static List<String> ans = new ArrayList<String>();
  static int k;
  static boolean[] visited;
  static String[] str;

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    k = sc.nextInt();
    visited = new boolean[10];
    str = new String[k];

    for (int i = 0; i < k; i++) {
      str[i] = sc.next();
    }
    sc.close();

    // 최댓값 백트래킹
    bt("", 0, true);

    // 최댓값 백트래킹
    bt("", 0, false);

    // sort ans
    Collections.sort(ans);

    // print ans
    System.out.println(ans.get(ans.size() - 1));
    System.out.println(ans.get(0));
  }

  /**
   * 백트래킹
   * 
   * @param result
   * @param depth
   */
  public static void bt(String result, int depth, boolean isMax) {
    if (depth == k + 1) { // 끝까지 탐색했을 때
      ans.add(result);
    } else {
      int start = isMax ? 9 - k : 0;
      int end = isMax ? 10 : k + 1;
      for (int i = start; i < end; i++) { // 0 ~ 9까지 탐색
        if (!visited[i]) { // 방문하지 않았을 때
          /**
           * 첫번째 숫자는 비교할 값이 없으므로 바로 넣고,
           * 두번째 숫자부터는 이전 숫자와 비교하여 부등호를 만족하는지 확인한다.
           */
          if (depth == 0 || compare(result.charAt(result.length() - 1) - '0', i, str[depth - 1])) {
            visited[i] = true; // 방문 표시
            bt(result + i, depth + 1, isMax); // 다음 depth로 이동
            visited[i] = false; // 방문 표시 해제
          }
        }
      }
    }
  }

  /**
   * 부등호를 만족하는지 확인하는 함수
   * 
   * @param num1
   * @param num2
   * @param str
   * @return 부등호를 만족하면 true, 아니면 false
   */
  public static boolean compare(int num1, int num2, String str) {
    if (str.equals("<")) {
      if (num1 < num2) {
        return true;
      }
    } else {
      if (num1 > num2) {
        return true;
      }
    }
    return false;
  }
}
