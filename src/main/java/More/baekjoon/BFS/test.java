package More.baekjoon.BFS;

public class test {

  public static void main(String[] args) {
    System.out.println(Integer.toString(4 / 7));
    System.out.println(Integer.toString(4 % 7));

    for (int location = 0; location < 49; location++) {
      int currentX = location / 7; // 0000000 1111111 222222
      int currentY = location % 7; // 0123456 0123456 0123456

      System.out.print(Integer.toString(currentX));
      System.out.print(Integer.toString(currentY));
    }

    /* 오, 왼, 상, 하를 다 탐색할 수 있음 */
    /* (2,2)의 경우 (1,2), (3,2), (2,3), (2,1) */
    int[][] moves = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    for (int[] move : moves) {
      System.out.println(move[0]);
      System.out.println(move[1]);

      current current = new current(2, 2);

      int nextX = current.x + move[0];
      int nextY = current.y + move[1];
    }
  }

  public static class current {
    public int x;
    public int y;

    public current(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }



}
