import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // T개의 테스트 케이스

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // N개의 통나무 개수
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                list.add(sc.nextInt());
            }

            int min = solve(list);

            System.out.println(min);
        }
        
        sc.close();
    }
    
    static int solve(List<Integer> list) {
        int min = 0, idx = 0;
        Collections.sort(list);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i+=2) {
            result.add(idx, list.get(i));
            idx++;
        }
        int startIdx = list.size() % 2 == 0 ? list.size() - 1 : list.size() - 2;
        for (int j = startIdx; j > 0; j-=2) {
            result.add(idx, list.get(j));
            idx++;
        }

        min = result.get(result.size() - 1) - result.get(0);
        for(int i = 1; i < result.size(); i++) {
            min = Math.max(min, Math.abs(result.get(i)-result.get(i - 1)));
        }

        return min;
    }
}