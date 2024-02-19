import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 7;
        int[] times = { 10, 10 };
        System.out.println(s.solution(n, times));
    }

    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);

        long left = 1;
        long right = (long) times[times.length - 1] * (long) n;

        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 0; i < times.length; i++) {
                cnt += mid / times[i];
            }

            if (cnt >= n) { // 사람 수보다 작거나 같은 경우
                answer = mid; // 결과값 갱신
                right = mid - 1; // 더 작은 값으로 탐색
            } else { // 사람 수보다 큰 경우
                left = mid + 1; // 더 큰 값으로 탐색
            }
        }

        return answer;
    }
}