import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int[] recommendations = new int[101]; // 각 학생의 추천 횟수
        int[] times = new int[101]; // 각 학생이 게시된 시간
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            int student = sc.nextInt();

            if (recommendations[student] > 0) {
                recommendations[student]++;
                continue;
            }

            if (result.size() >= N) {
                int removeIdx = 0;
                for (int j = 1; j < result.size(); j++) {
                    int curr = result.get(j);
                    int min = result.get(removeIdx);

                    // 추천 수가 적거나, 추천 수가 같으면 오래된 학생 제거
                    if (recommendations[curr] < recommendations[min]
                            || (recommendations[curr] == recommendations[min] && times[curr] < times[min])) {
                        removeIdx = j;
                    }
                }
                int removed = result.remove(removeIdx);
                recommendations[removed] = 0;
            }

            result.add(student);
            recommendations[student] = 1;
            times[student] = i;
        }

        sc.close();

        Collections.sort(result);
        for (int student : result) {
            System.out.print(student + " ");
        }
    }
}

// 2 7 6

/**
 * 3
 * 12
 * 1 5 1 1 7 5 9 9 9 5 4 6
 * 
 * 1 - 3, -
 * 5 - 3, 1
 * 7 - 1, -
 * 9 - 3, 6
 * 4 - 1, -
 * 6 - 1, 11
 * 
 * 6 5 9
 */