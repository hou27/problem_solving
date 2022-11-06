import java.util.*;

// Q1 - 낙낙
/**
 * 장소를 영어로 표기하였을 때, 해당 문자열에서 일부 글자들을 지워 “nak” 라는 문자열을 만들 수 있다면, 우리는 이 장소가 낙 한 장소라고 부릅니다.
마찬가지로, “naknak” 이라는 문자열을 만들 수 있다면, 우리는 이 장소가 낙낙 한 장소라고 부릅니다.
마지막으로, 위와 같은 방법으로 “naknaknak” 이라는 문자열을 만들 수 있다면, 우리는 이 장소가 낙낙낙 한 장소라고 부를 겁니다.
어떤 장소를 빌릴 때, 그 장소가 낙낙 하지만 낙낙낙 하지 않은 장소인 경우에만 대여하려고 합니다.
섭외 가능한 건물들의 목록인 buildings 가 매개변수로 주어질 때, 각각의 건물들을 대여할지의 여부를 return 하는 solution 함수를 완성해주세요.
 */

/**
 * 제약조건
 * buildings 의 길이는 1 이상 100 이하입니다.
 * 한 건물의 이름의 길이는 10 이상 1,000 입니다.
 * buildings 배열에 들어있는 모든 문자열의 길이는 최대 100,000 이하입니다.
 * buildings 배열에 들어있는 문자열은 알파벳 소문자 및 공백으로 구성되어 있습니다.
 * 각각의 건물에 대해, 대여를 한다면 O 를, 대여를 하지 않는다면 X 를 담아서 반환해주세요.
 */

/**
 * 입출력 예 #1
 * sungsoo_naknak 은 naknak을 포함하고 있으므로, 낙낙 합니다.
 * sungsoo_naknaknak 은 naknak을 포함하고 있으므로, 낙낙 하지만 naknaknak 을 포함하고 있으므로, 낙낙낙 합니다.
 * sungsoo_nak은 낙낙하지 않습니다.
 * 
 * 입출력 예 #2
 * i_am_not_a_kim_and_not_awk 은 naknak을 포함하고 있으므로, 낙낙 합니다.
 * nananananakkkk 은 낙낙하지 않습니다.
 */

public class Solution {
  public static ArrayList<String> solution(ArrayList<String> buildings) {
    ArrayList<String> answer = new ArrayList<String>();

    for (String building : buildings) {
      char[] buildingChars = building.toCharArray();
      int nakFlag = 0; // 0 : n, 1 : a, 2 : k
      int nakCount = 0;
      for (int i = 0; i < buildingChars.length; i++) {
        if (buildingChars[i] == 'n') {
          nakFlag = 1;
        } else if (nakFlag == 1 && buildingChars[i] == 'a') {
          nakFlag = 2;
        } else if (nakFlag == 2 && buildingChars[i] == 'k') {
          nakFlag = 0;
          nakCount++;
        }
      }

      if (nakCount == 2) {
        answer.add("O");
      } else {
        answer.add("X");
      }
    }

    buildings = answer;
    return buildings;
  }
}
