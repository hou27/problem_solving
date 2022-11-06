import java.util.*;

// Q2 - 상금

/**
 * 선수 A와 선수 B가 경기하게 되면, 선수 A의 퍼텐셜은 A의 힘 + B의 힘 * A가 장착하고 있는 보조도구의 힘 입니다. 복싱은 반드시
 * 퍼텐셜이 더 높은 사람이 승리합니다.
 * 
 * 보조도구가 성공적으로 작동하는 것을 확인한 기웅이는, 본격적으로 GDSC 멤버들에게 이를 나누어주고 대회를 열려고 합니다. 그럼에도
 * 불구하고 사람들이 별로 내키지 않아하자, 사비를 지출하여 우수한 사람들에게 상금을 지급하려고 합니다.
 * 
 * 하지만 무조건 이긴다고 상금을 퍼주게 된다면, 기웅이는 틀림없이 엄청난 손해를 보게 될테니, 다음과 같은 방법으로 상금을 지급하려고
 * 합니다.
 * 
 * 먼저, 사람들을 일렬로 줄 세웁니다.
 * 이어서, 모든 사람들은 다른 모든 사람들과 한 번씩 복싱 경기를 펼칩니다.
 * 다시 원래 줄로 돌아가서, 각자의 사람들에게 (본인이 이긴 경기 수) + (자기보다 앞에 서 있는 사람들 중 자신이 이긴 사람의 수)
 * 만큼의 상금을 지급합니다.
 * 당연하겠지만, 사람들이 어떻게 줄을 서냐에 따라 지급되는 상금은 달라집니다.
 * 
 * 예를 들어, A, B, C 라는 선수들이 있고 각 선수들의 스펙이 다음과 같다고 가정해 봅시다.
 * 
 * 선수명 | 힘 | 보조도구의 힘
 * A 10 3
 * B 20 4
 * C 15 5
 * 이 경우, 매치는 “A-B”, “A-C”, “B-C” 로 이루어질 수 있으며, 각각의 경기 결과는 다음과 같습니다.
 * 
 * A-B의 경우, A의 퍼텐셜은 70, B의 퍼텐셜은 60이 되어 A가 승리합니다.
 * A-C의 경우, A의 퍼텐셜은 55, C의 퍼텐셜은 65가 되어 C가 승리합니다.
 * B-C의 경우, B의 퍼텐셜은 80, C의 퍼텐셜은 115가 되어 C가 승리합니다.
 * 만약, 이 상황에서, A - B - C와 같은 순서대로 줄을 서게 될 경우, A는 1, B는 0, 그리고 C는 4 만큼의 상금을 받아가게
 * 됩니다. 하지만 C - A - B 와 같은 순서대로 줄을 서게 될 경우, A는 1, B는 0, 그리고 C는 2 만큼의 상금을 받게 되고,
 * 상금의 합을 이보다 더 줄일 수는 없습니다.
 * 
 * 기웅이는 어떻게든 본인이 지불할 돈을 줄이려고 합니다. 이에, 주어진 사람들의 스펙이 주어질 때 기웅이가 돈을 가장 많이 아낄 수 있는
 * 방법을 찾아 보세요.
 */

/**
 * 제약조건
 * specs의 길이는 500 이하 입니다.
 * spec은 [name, power, supplement] 로 구성되어 있습니다.
 * name은 학생의 이름으로, 알파벳 대문자로만 구성되어 있습니다. name의 길이는 최대 10입니다.
 * power는 학생의 힘으로, 1 이상 1,000 이하의 자연수입니다.
 * supplement는 보조도구의 힘으로, 1 이상 1,000 이하의 자연수입니다.
 * 학생들의 이름이 중복되는 경우는 없습니다.
 * 만약 두 명이 비긴다면, 둘 모두 승리하지 못한 것으로 간주합니다.
 * 가능한 경우의 수가 2개 이상이라면, 사전순으로 가장 뒤에 오는 경우를 출력합니다.
 */

/**
 * 입출력 예
 * specs
 * [[“A”, 10, 3], [“B”, 20, 4], [“C”, 15, 5]]
 * result
 * [“C”, “A”, “B”]
 * 
 * specs
 * [[“GDSC”, 100, 17], [“ELICE”, 20, 20]]
 * result
 * [“ELICE”, “GDSC”]
 * 
 * specs
 * [[“B”, 10, 3], [“A”, 10, 3], [“BB”, 10, 3], [“AA”, 10, 3]]
 * result
 * [“BB”, “B”, “AA”, “A”]
 * 
 * 입출력 예 설명
 * 
 * 입출력 예 #1
 * 문제 예시와 같습니다.
 * 
 * 입출력 예 #2
 * GDSC와 ELICE가 경기를 할 경우, ELICE가 승리합니다.
 * GDSC의 퍼텐셜은 100 + 17 * 20 = 440 입니다.
 * ELICE의 퍼텐셜은 20 + 20 * 100 = 2020 입니다.
 * GDSC - ELICE 일 경우 기웅이는 0 + 2 만큼의 상금을 지급해야 합니다.
 * ELICE - GDSC 일 경우 기웅이는 1 + 0 만큼의 상금을 지급해야 합니다.
 * 입출력 예 #3
 * 4명 모두 퍼센셜이 같습니다.
 * 가능한 경우가 여러 가지이므로, 사전 순으로 가장 뒤에 오는 것을 출력합니다.
 */

/**
 * 풀이
 * 
 * 가장 많이 이긴 순으로 나열
 */
public class Solution {
  static ArrayList<participant>[] rewardList = new ArrayList[1001];
  // static ArrayList<ArrayList<participant>> rewardList = new ArrayList<>();

  public static ArrayList<String> solution(ArrayList<ArrayList<String>> specs) {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<participant> participantList = new ArrayList<>();

    for (int i = 0; i < specs.size(); i++) {
      participantList.add(new participant(specs.get(i).get(0), Integer.parseInt(specs.get(i).get(1)),
          Integer.parseInt(specs.get(i).get(2))));
    }

    for (int i = 0; i < participantList.size() - 1; i++) {
      for (int j = 1; j < participantList.size(); j++) {
        if (participantList.get(i).getPotential(participantList.get(j).power) > participantList.get(j)
            .getPotential(participantList.get(i).power)) {
          participantList.get(i).addWinAgainst(participantList.get(j).name);
          participantList.get(j).addLoseAgainst(participantList.get(i).name);
        } else if (participantList.get(i).getPotential(participantList.get(j).power) < participantList.get(j)
            .getPotential(participantList.get(i).power)) {
          participantList.get(j).addWinAgainst(participantList.get(i).name);
          participantList.get(i).addLoseAgainst(participantList.get(j).name);
        }
      }
    }

    // 가장 많이 이긴 사람을 가장 앞으로, 같은 경우 그 둘 중 이긴 사람을 앞으로 정렬하여 result에 저장
    Collections.sort(participantList, new Comparator<participant>() {
      @Override
      public int compare(participant o1, participant o2) {
        if (o1.winAgainst.size() > o2.winAgainst.size()) {
          return -1;
        } else if (o1.winAgainst.size() < o2.winAgainst.size()) {
          return 1;
        } else {
          if (o1.winAgainst.contains(o2.name)) {
            return -1;
          } else if (o2.winAgainst.contains(o1.name)) {
            return 1;
          } else {
            // 둘의 이름을 사전 역순으로 정렬
            return o2.name.compareTo(o1.name);
          }
        }
      }
    });

    for (int i = 0; i < participantList.size(); i++) {
      result.add(participantList.get(i).name);
    }

    return result;
  }
}

class participant {
  String name;
  int power;
  int supplement;
  ArrayList<String> winAgainst;
  ArrayList<String> loseAgainst;

  public participant(String name, int power, int supplement) {
    this.name = name;
    this.power = power;
    this.supplement = supplement;
    this.winAgainst = new ArrayList<>();
    this.loseAgainst = new ArrayList<>();
  }

  public int getPotential(int againstPower) {
    return this.power + againstPower * this.supplement;
  }

  public void addWinAgainst(String name) {
    this.winAgainst.add(name);
  }

  public void addLoseAgainst(String name) {
    this.loseAgainst.add(name);
  }

  public int getWinCount() {
    return this.winAgainst.size();
  }

  public int getLoseCount() {
    return this.loseAgainst.size();
  }

  public boolean checkWinAgainst(String name) {
    return this.winAgainst.contains(name);
  }

  public boolean checkLoseAgainst(String name) {
    return this.loseAgainst.contains(name);
  }
}
