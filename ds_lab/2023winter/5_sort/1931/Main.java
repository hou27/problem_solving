import java.util.Arrays;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // 시작 시간 기준 오름차순 정렬(시작 시간이 같다면 끝나는 시간 기준)
    @Override
    public int compareTo(final Meeting o) {
        if (o.start == start) {
            return end - o.end;
        }
        return start - o.start;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Meeting[] meetings = new Meeting[N];
        int cnt = 1;
        
        for (int i = 0; i < N; i++) {
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());       
        }

        Arrays.sort(meetings);

        int prevEndTime = meetings[0].end;
        for (int i = 1; i < N; i++) {
            if (meetings[i].start == meetings[i - 1].start) { // 시작 시간 같은 것 제외(끝나는 시간이 가장 빠른 것만을 포함)
                if (meetings[i].end == meetings[i - 1].end && meetings[i].start == meetings[i - 1].end) { // 시작시간과 끝시간이 같은 경우 여러 회의 선택 가능..?
                    cnt++;
                }
                else if (meetings[i].start == meetings[i - 1].end) {
                    cnt++;
                }
                continue;
            }
            if (meetings[i].start >= prevEndTime) {
                cnt++;
                prevEndTime = meetings[i].end;
            }
            else if (meetings[i].start < prevEndTime && meetings[i].end < prevEndTime) {
                prevEndTime = meetings[i].end;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
