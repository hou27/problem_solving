import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// N개의 정수로 이루어진 배열 A가 주어진다. 이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.
//|A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nArr = new int[sc.nextInt()];
    List<Integer> sortedlist = new ArrayList<>();
    List<Integer> organizedlist = new ArrayList<>();
    int max = 0;

    for (int i = 0; i < nArr.length; i++) {
      nArr[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(nArr);
    for (int i : nArr) {
      sortedlist.add(i);
    }

    // 최댓값 넣고 시작
    organizedlist.add(sortedlist.remove(sortedlist.size() - 1));

    // 리스트 정리
    for (;;) {
      if (sortedlist.isEmpty()) {
        break;
      }

      if (organizedlist.size() % 4 == 1) {
        organizedlist.add(organizedlist.size(), sortedlist.remove(0));
      } else if (organizedlist.size() % 4 == 2) {
        organizedlist.add(0, sortedlist.remove(0));
      } else if (organizedlist.size() % 4 == 3) {
        organizedlist.add(organizedlist.size(), sortedlist.remove(sortedlist.size() - 1));
      } else if (organizedlist.size() % 4 == 0) {
        organizedlist.add(0, sortedlist.remove(sortedlist.size() - 1));
      }
    }

    // 식의 최댓값 계산
    for (int i = 0; i < organizedlist.size() - 1; i++) {
      max += Math.abs(organizedlist.get(i) - organizedlist.get(i + 1));
    }

    System.out.println(max);
  }

}
