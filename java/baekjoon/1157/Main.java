import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    int[] cntArr = new int[26];
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) > 64 && str.charAt(i) < 91) {
        cntArr[str.charAt(i) - 65]++;
      }
      else {
        cntArr[str.charAt(i) - 97]++;
      }
    }
    
    int max = 0;
    char maxChar = '?';
    for (int i = 0; i < 26; i++) {
      if(cntArr[i] > max) {
        max = cntArr[i];
        maxChar = (char)(i + 65);
      }
      else if(cntArr[i] == max) {
        maxChar = '?';
      }
    }

    System.out.println(maxChar);
  }
}
