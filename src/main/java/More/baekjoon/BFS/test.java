package More.baekjoon.BFS;

public class test {

  public static void main(String[] args) {
    System.out.println(Integer.toString(4/7));
    System.out.println(Integer.toString(4%7));

    for (int location = 0; location < 49; location++) {
      int currentX = location / 7; // 0000000 1111111 222222
      int currentY = location % 7; // 0123456 0123456 0123456

      System.out.print(Integer.toString(currentX));
      System.out.print(Integer.toString(currentY));
    }

  }

}
