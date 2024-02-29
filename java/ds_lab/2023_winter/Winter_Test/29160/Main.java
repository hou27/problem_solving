import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String arr[] = s.split(" ");
        int N = Integer.parseInt(arr[0]); // 선수의 수
        int K = Integer.parseInt(arr[1]); // K년
        List<Integer>[] list = new ArrayList[12];
        for (int i = 1; i < 12; i++) {
            list[i] = new ArrayList<>();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            arr = s.split(" ");
            int P = Integer.parseInt(arr[0]); // 선수의 포지션 번호
            int W = Integer.parseInt(arr[1]); // 선수 가치
            list[P].add(W);
        }

        for (int i = 1; i < 12; i++) {
            Collections.sort(list[i], Collections.reverseOrder()); // 내림차순 정렬
        }

        for (int l = 1; l <= K; l++) {
            for (int i = 1; i <= 11; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    list[i].set(j, Math.max(list[i].get(j) - 1, 0)); // 선수들의 가치를 1씩 감소
                }
            }

            for (int i = 1; i <= 11; i++) {
                if (!list[i].isEmpty()) { // 해당 포지션의 선수가 있을 경우
                    pq.add(list[i].get(0)); // 가장 가치가 높은 선수를 우선순위 큐에 추가
                }
            }

            while (!pq.isEmpty()) {
                sum += pq.poll();
            }
        }

        System.out.println(sum);
    }
}
