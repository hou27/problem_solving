import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        // 두 배열을 리스트로 변환
        List<Integer> aList = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(B).boxed().collect(Collectors.toList());

        // 내림차순 정렬
        aList.sort((o1, o2) -> o2 - o1);
        bList.sort((o1, o2) -> o2 - o1);

        for (int i = 0; i < bList.size(); i++) {
            for (int j = 0; j < aList.size(); j++) { // bList의 가장 큰 값부터 하나씩 aList의 가장 큰 값과 비교
                if (aList.get(j) < bList.get(i)) { // bList의 값이 더 크면 answer 증가
                    answer++;
                    // aList의 값 제거
                    aList.remove(j);
                    break;
                }
            }
        }

        return answer;
    }
}