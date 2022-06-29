import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n1 = sc.next();
    String n2 = sc.next();
    sc.close();
    // reverse n1
    int reversedN1 = Integer.parseInt(new StringBuilder(n1).reverse().toString());
    // reverse n2
    int reversedN2 = Integer.parseInt(new StringBuilder(n2).reverse().toString());

    // compare n1 and n2 then print the larger one
    System.out.println(reversedN1 > reversedN2 ? reversedN1 : reversedN2);
  }
}
