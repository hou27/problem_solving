import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        // Please write your code here.

        HashMap<Long, Integer> map = new HashMap<>();

        long pattern = 0;
        for (int i = 0; i < K; i++) {
            pattern = (pattern << 1) | (S.charAt(i) - '0');
        }
        map.put(pattern, 1);

        // System.out.println(Long.toBinaryString(1L << 2));
        long mask = ~(1L << K);
        for (int i = K; i < S.length(); i++) {
            pattern = ((pattern << 1) & mask) | (S.charAt(i) - '0');

            int currCnt = map.getOrDefault(pattern, 0);
            if (currCnt == M - 1) {
                System.out.println(1);
            } else {
                map.put(pattern, currCnt + 1);
            }
        }

        System.out.println(0);
    }
}