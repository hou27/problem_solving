class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int N = sizes.length;
        int[][] dp = new int[N][2];

        for (int i = 0; i < N; i++) {
            dp[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            dp[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        }

        int maxW = 0;
        int maxH = 0;
        for (int i = 0; i < N; i++) {
            maxW = Math.max(maxW, dp[i][0]);
            maxH = Math.max(maxH, dp[i][1]);
        }

        answer = maxW * maxH;

        return answer;
    }
}