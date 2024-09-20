class Solution {
    public int solution(String numbers) {
        int answer = 0;
        int N = numbers.length();
        boolean[] prime = new boolean[10000000];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i < 10000000; i++) {
            if (!prime[i]) {
                for (int j = i * i; j < 10000000; j += i) {
                    prime[j] = true;
                }
            }
        }

        return answer;
    }
}