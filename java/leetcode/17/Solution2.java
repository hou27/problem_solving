import java.util.*;

class Solution2 {
    public List<String> letterCombinations(String digits) {
        String[] dials = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        Queue<String> queue = new LinkedList<String>();
        queue.offer("");

        for (char digit : digits.toCharArray()) {
            String candidates = dials[digit - '0'];
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String currentStr = queue.poll();
                for (char candidate : candidates.toCharArray()) {
                    queue.offer(currentStr + candidate);
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
