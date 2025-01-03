
public class Main {

}

// It would be "without duplicate characters"

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 1;

        if (s.length() == 0)
            return 0;

        int startIdx = 0;
        String currS = "";
        while (startIdx <= s.length() - maxLen) {
            for (int i = startIdx; i < s.length(); i++) {
                char c = s.charAt(i);
                if (currS.indexOf(c) == -1) {
                    currS += c;
                } else {
                    break;
                }
                maxLen = maxLen > currS.length() ? maxLen : currS.length();
            }
            currS = "";
            startIdx++;
        }

        return maxLen;
    }
}