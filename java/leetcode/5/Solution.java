class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int oddCaseLen = check(s, i, i);
            int evenCaseLen = check(s, i, i + 1);

            int len = oddCaseLen > evenCaseLen ? oddCaseLen : evenCaseLen;

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private int check(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}