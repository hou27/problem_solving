import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

// Real Submission
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // wordDict.sort(null);

        return isPossible(s, wordDict);
    }

    static public boolean isPossible(String s, List<String> wordDict) {
        Stack<List<Integer>> stack = new Stack<>();
        ArrayList<Integer> idxList = new ArrayList<>();
        idxList.add(0);
        stack.push(idxList);
        Set<String> wordSet = new HashSet<>(wordDict);

        while (!stack.isEmpty()) {
            List<Integer> curr = stack.pop();
            for (int c : curr) {
                System.out.println(c + ", ");
            }
            int lastIndex = curr.get(curr.size() - 1);
            if (lastIndex == s.length()) {
                return true;
            }

            for (int i = lastIndex + 1; i <= s.length(); i++) {
                String currStr = i == s.length()
                        ? s.substring(lastIndex)
                        : s.substring(lastIndex, i);
                if (wordSet.contains(currStr)) {
                    List<Integer> newList = new ArrayList<>(curr);
                    newList.add(i);
                    stack.push(newList);
                }
            }
        }

        return false;
    }
}
