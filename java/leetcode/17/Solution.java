import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return bfs(digits);
    }

    static List<String> bfs(String digits) {
        String[] pad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (char digit : digits.toCharArray()) { // 모든 이전에 제작된 케이스들에 대해 작업
            int size = queue.size(); // 케이스 개수
            String values = pad[digit - '0']; // 해당 숫자에 해당하는 값들

            for (int i = 0; i < size; i++) { // 모든 가능한 자리에 배치
                String combination = queue.poll();
                for (char letter : values.toCharArray()) {
                    queue.offer(combination + letter); // 새로운 문자 붙여서 추가
                }
            }
        }

        return new ArrayList<>(queue); // 최종 결과 반환
    }
}
