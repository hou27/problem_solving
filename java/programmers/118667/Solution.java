import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        long sum1 = Arrays.stream(queue1).sum();
        long sum2 = Arrays.stream(queue2).sum();
        long totalSum = sum1 + sum2;
        long limitPerQueue = totalSum / 2;

        int fullLength = queue1.length + queue2.length;
        int idxFor1 = 0;
        int idxFor2 = 0;
        answer = 0;
        int changeCnt = 0;
        boolean flag = sum1 < limitPerQueue;
        boolean prevFlag = sum1 < limitPerQueue;
        while (sum1 != limitPerQueue) {
            if (idxFor1 >= fullLength || idxFor2 >= fullLength) {
                return -1;
            }
            if (prevFlag != flag) {
                changeCnt++;
                if (changeCnt > 1) {
                    return -1;
                }
            }
            if (sum1 < limitPerQueue) {
                if (idxFor2 >= queue2.length) {
                    sum1 -= queue1[idxFor2 - queue2.length];
                } else {
                    sum1 += queue2[idxFor2];
                }
                idxFor2++;
            } else {
                if (idxFor1 >= queue1.length) {
                    sum1 -= queue2[idxFor1 - queue1.length];
                } else {
                    sum1 -= queue1[idxFor1];
                }
                // sum2 -= queue2[idxFor2];
                idxFor1++;
            }
            answer++;
        }

        return answer;
    }
}