import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int max = Integer.MIN_VALUE;
  static int n;
  static char[] expression;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    expression = br.readLine().toCharArray();

    bf(2, expression[0] - '0');

    bw.write(String.valueOf(max));
    bw.flush();

    br.close();
    bw.close();
  }

  /**
   * 괄호 내의 연산자는 하나만 존재함.
   * 
   * 괄호를 사용하는 경우
   * - 다음다음다음다음(=다음다음숫자)으로 이동해야함.
   * 
   * 괄호를 사용하지 않는 경우
   * - 현재 숫자와 다음 숫자를 계산하고 다음 숫자로 이동
   */
  private static void bf(int index, int result) {
    if (index >= n) {
      max = max > result ? max : result;
      return;
    }

    // 괄호를 사용하는 경우
    if (index + 2 < n) {
      int next = cal(expression[index] - '0', expression[index + 2] - '0', expression[index + 1]);
      bf(index + 4, cal(result, next, expression[index - 1]));
    }
    // 괄호를 사용하지 않는 경우
    bf(index + 2, cal(result, expression[index] - '0', expression[index - 1]));
  }

  private static int cal(int n1, int n2, char op) {
    if (op == '+') {
      return n1 + n2;
    } else if (op == '-') {
      return n1 - n2;
    } else {
      return n1 * n2;
    }
  }
}
