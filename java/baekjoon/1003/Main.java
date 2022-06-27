import java.util.Scanner;

// 시간 초과로 실패
// public class Main {
//   private static int zeroCnt = 0;
//   private static int oneCnt = 0;
//   public void fibonacci(int n) {
//     if (n == 0) {
//       zeroCnt++;
//     } else if (n == 1) {
//       oneCnt++;
//     } else {
//       fibonacci(n - 1);
//       fibonacci(n - 2);
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int N = sc.nextInt();
//     Main main = new Main();
//     for (int i = 0; i < N; i++) {      
//       int n = sc.nextInt();
//       main.fibonacci(n);
//       System.out.println(zeroCnt + " " + oneCnt);
//       zeroCnt = 0;
//       oneCnt = 0;
//     }
//     sc.close();
//   }
// }

// Dynamic Programming
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fibonacciArr[][] = new int[41][2];

    int N = sc.nextInt();
    
    fibonacciArr[0][0] = 1;
    fibonacciArr[0][1] = 0;
    fibonacciArr[1][0] = 0;
    fibonacciArr[1][1] = 1;

    for (int i = 2; i < 41; i++) {
      fibonacciArr[i][0] = fibonacciArr[i - 1][0] + fibonacciArr[i - 2][0];
      fibonacciArr[i][1] = fibonacciArr[i - 1][1] + fibonacciArr[i - 2][1];
    }

    for (int i = 0; i < N; i++) {      
      int n = sc.nextInt();
      System.out.println(fibonacciArr[n][0] + " " + fibonacciArr[n][1]);
    }
    sc.close();
  }
}