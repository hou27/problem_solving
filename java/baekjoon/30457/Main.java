import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 단체 줄넘기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 수
        int[] A = new int[N]; // 줄넘기를 하는 학생들의 키
        int cnt = 0;

        List<Integer> leftSide = new ArrayList<>();
        List<Integer> rightSide = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(A);

        // 순서대로 양쪽 번갈아가며 배치(단, 해당 방향을 바라보는 이전에 배치된 학생보다 키가 큰 경우에만 배치)
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (leftSide.size() > 0 && leftSide.get(leftSide.size() - 1) < A[i]) {
                    leftSide.add(A[i]);
                }
                else if (leftSide.size() == 0) {
                    leftSide.add(A[i]);
                }
            } else {
                if (rightSide.size() > 0 && rightSide.get(rightSide.size() - 1) < A[i]) {
                    rightSide.add(A[i]);
                }
                else if (rightSide.size() == 0){
                    rightSide.add(A[i]);
                }
            }
        }
        
        System.out.println(leftSide.size() + rightSide.size());

        sc.close();
    }
}
