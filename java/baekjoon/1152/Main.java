import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();

    String stripStr = str.strip();
    if (stripStr.length() == 0) {
      System.out.println(0);
      return;
    }

    String[] strs = stripStr.split(" ");

    System.out.println(strs.length);
  }
}
