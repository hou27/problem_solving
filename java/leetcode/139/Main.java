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

        while (!stack.isEmpty()) {
            List<Integer> curr = stack.pop();
            for (int c : curr) {
                System.out.println(c + ", ");
            }
            int lastIndex = curr.get(curr.size() - 1);
            if (lastIndex == s.length()) {
                return true;
            }
            for (String w : wordDict) {
                int len = w.length();
                if (lastIndex + len > s.length()) {
                    continue;
                }
                String currStr = lastIndex + len == s.length()
                        ? s.substring(lastIndex)
                        : s.substring(lastIndex, lastIndex + len);
                System.out.println("currStr : " + currStr);
                System.out.println("w : " + w);
                if (currStr.equals(w)) {
                    List<Integer> newList = new ArrayList<>(curr);
                    newList.add(lastIndex + len);
                    stack.push(newList);
                }
            }
        }

        return false;
    }
}
