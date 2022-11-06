import java.util.*;

// Q3 - 골목대장

/**
 * edges : [[0, 1], [1, 2], [1, 3], [3, 4]] - result : 12
 * 입출력 예 설명
 * 
 * 1번집과 3번집을 잇는 길에서 통행료를 걷을 경우, 12만원을 걷을 수 있습니다. 그리고 이 경우가 최댓값입니다.
 * 0 → 3
 * 0 → 4
 * 1 → 3
 * 1 → 4
 * 2 → 3
 * 2 → 4
 * 3 → 0
 * 3 → 1
 * 3 → 2
 * 4 → 0
 * 4 → 1
 * 4 → 2
 */

/**
 * 풀이
 *
 * 그래프는 트리이다.
 */
public class Solution {
  public static long solution(ArrayList<ArrayList<Integer>> edges) {

    int max = 0;
    for (int i = 0; i < edges.size(); i++) {
      int newMax = calculateTolls(edges, i);
      max = max > newMax ? max : newMax;
    }

    return max;
  }

  private static int calculateTolls(ArrayList<ArrayList<Integer>> edges, int tollgateIndex) {
    int max = 0;
    // 모든 각 지점에서의 통행료를 계산한다.
    // 각 지점들은 0부터 시작한다.
    // 각 지점들의 개수는 edges.size() + 1이다.
    for (int i = 0; i < edges.size() + 1; i++) {
      int current = i;
      for (int j = 0; j < edges.size() + 1; j++) {
        int destination = j;
        for (int k = 0; k < edges.size(); k++) {
          ArrayList<Integer> edge = edges.get(k);
          if (edge.contains(current)) {
            if (tollgateIndex == k) {
              max += 1;
              break;
            }
            current = edge.get(0) == current ? edge.get(1) : edge.get(0);
            if (current == destination) {
              break;
            }
          }
        }
      }
    }
    return max;
  }
}