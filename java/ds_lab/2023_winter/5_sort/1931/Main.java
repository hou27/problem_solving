import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] schedule = new int[N][2];
        int cnt = 1;
        
        for (int i = 0; i < N; i++) {
            schedule[i][0] = sc.nextInt();
            schedule[i][1] = sc.nextInt();            
        }

        // 시작 시간 기준 오름차순 정렬(시작 시간이 같다면 끝나는 시간 기준)
        Arrays.sort(schedule, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2){
                if(s1[0] == s2[0]) {
                    return s1[1] - s2[1];
                }
                else {
                    return s1[0] - s2[0];
                }
            }
        });

        int prevEndTime = schedule[0][1];
        // 시작 시간 같은 것 제외(끝나는 시간이 가장 빠른 것만을 포함)
        for (int i = 1; i < N; i++) {
            if (schedule[i][0] == schedule[i - 1][0]) {
                if (schedule[i][1] == schedule[i - 1][1]) { // 시작시간과 끝시간이 같은 경우 여러 회의 선택 가능..?
                    cnt++;
                }
                continue;
            }
            else if (schedule[i][0] >= prevEndTime) {
                cnt++;
                prevEndTime = schedule[i][1];
            }
            else if (schedule[i][0] < prevEndTime && schedule[i][1] < prevEndTime) {
                prevEndTime = schedule[i][1];
            }
        }

        System.out.println(cnt);

        sc.close();        
    }
}
