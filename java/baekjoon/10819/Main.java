import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// N개의 정수로 이루어진 배열 A가 주어진다. 이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.
//|A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nArr = new int[sc.nextInt()];
    int max = 0;

    for (int i = 0; i < nArr.length; i++) {
      nArr[i] = sc.nextInt();
    }

    sc.close();

    // dfs로 모든 경우의 수 탐색
    List<Integer> list = new ArrayList<>();
    for (int i : nArr) {
      list.add(i);
    }

    max = dfs(list, 0);

    System.out.println(max);
  }

  private static int dfs(List<Integer> list, int idx) {
    if (idx == list.size() - 1) { // 마지막 원소까지 탐색했을 때
      int max = 0;
      for (int j = 0; j < list.size() - 1; j++) { // 식의 최댓값 계산
        max += Math.abs(list.get(j) - list.get(j + 1)); // 절대값으로 계산
      }
      return max;
    }

    int max = 0; // 최댓값 다시 초기화
    for (int j = idx; j < list.size(); j++) { // 모든 경우의 수 탐색
      // idx번째 원소와 j번째 원소를 바꿈
      int tmp = list.get(idx);
      list.set(idx, list.get(j));
      list.set(j, tmp);
      max = Math.max(max, dfs(list, idx + 1)); // 최댓값 갱신
      // 다시 원래대로 돌려놓음
      tmp = list.get(idx);
      list.set(idx, list.get(j));
      list.set(j, tmp);
    }

    return max;
  }

}
