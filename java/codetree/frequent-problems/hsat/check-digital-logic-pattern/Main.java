import java.util.*;

public class Main {
    public static void main(String[] args) { // throws IOException {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        // Please write your code here.

        HashMap<Long, Integer> map = new HashMap<>();

        // String pattern = S.substring(0, K);
        long pattern = 0;
        for (int i = 0; i < K; i++) {
            pattern = (pattern << 1) | (S.charAt(i) - '0');
        }
        map.put(pattern, 1);

        // System.out.println(Long.toBinaryString(~(1 << 3)));

        for (int i = K; i < S.length(); i++) {
            long mask = ~(1 << K); // 최상위 비트 버리기용
            // System.out.println("pattern: " + Long.toBinaryString(pattern));
            // System.out.println("mask: " + Long.toBinaryString(mask));
            pattern = (pattern << 1) & mask | (S.charAt(i) - '0');
            int cnt = map.getOrDefault(pattern, -1);
            // System.out.println("pattern: " + Long.toBinaryString(pattern) + ", cnt: " +
            // cnt);
            if (cnt == M - 1) {
                System.out.println(1);
                return;
            } else if (cnt != -1) {
                map.replace(pattern, cnt + 1);
            } else {
                map.put(pattern, 1);
            }
        }

        System.out.println(0);
    }
}