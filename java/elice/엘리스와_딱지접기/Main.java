package java.elice.엘리스와_딱지접기;

import java.util.*;

class Rectangle {
  /* 1. Rectangle 클래스를 완성해봅시다. */
  private int width;
  private int height;
  private int area;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    this.area = this.width * this.height;
  }

  public int getArea() {
    return this.area;
  }
}

class Square extends Rectangle {
  /* 2. Square 클래스를 정의하고, 완성해봅시다. */
  public Square(int width) {
    super(width, width);
  }

  public int getArea() {
    return super.getArea();
  }
}

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    if (t == 1) {
      Rectangle rect = new Rectangle(sc.nextInt(), sc.nextInt());
      System.out.println(rect.getArea());
    } else {
      Square sq = new Square(sc.nextInt());
      System.out.println(sq.getArea());
    }

    sc.close();
  }
}
