import java.util.*;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) { // throws IOException {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String S = br.readLine();
        // String[] input = br.readLine().split(" ");
        // int K = Integer.parseInt(input[0]);
        // int M = Integer.parseInt(input[1]);
        String S = sc.next();
        int K = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        // Please write your code here.

        HashMap<String, Integer> map = new HashMap<>();

        String pattern = S.substring(0, K);

        map.put(pattern, 1);

        for (int i = K; i < S.length(); i++) {
            pattern = pattern.substring(1) + S.charAt(i);
            System.out.println("pattern.substring(1): " + pattern.substring(1) + ", S.charAt(i): " + S.charAt(i));
            int cnt = map.getOrDefault(pattern, -1);
            System.out.println("pattern: " + pattern + ", cnt: " + cnt);
            if (cnt == M - 1) {
                System.out.println(1);
                return;
            } else if (cnt != -1) {
                map.replace(pattern, cnt + 1);
            } else {
                map.put(pattern, 1);
            }
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + ", " + m.getValue());
        }

        System.out.println(0);
    }
}