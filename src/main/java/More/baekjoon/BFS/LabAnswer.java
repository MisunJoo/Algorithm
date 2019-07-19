package More.baekjoon.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LabAnswer {
  public static class Point{
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
  }

  static int N;
  static int M;
  static int mininumVirus;
  static int[][] moves =  {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
  static int[][] map;
  static int[][] tmpMap;
  static int maxSafetyCount;
  static List<Point> virusArr = new ArrayList<Point>();
  static List<Point> wallArr = new ArrayList<Point>();

  public static void main(String[] args) throws Exception{
    System.out.println("hello");

    map = new int[][]
        { {2, 0, 0, 0, 1, 1, 0},
            {0, 0, 1, 0, 1, 2, 0},
            {0, 1, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0}};

    virusArr = Arrays.asList(
        new Point(0, 4), new Point(0,5),
        new Point(1, 2), new Point(1, 4),
        new Point(2,1), new Point(2, 2), new Point(2,4),
        new Point(3,1),
        new Point(4,5), new Point(4, 6),
        new Point(5,1),
        new Point(6,1)
    );

    wallArr = Arrays.asList(
        new Point(0,0),
        new Point(1,5)
    );

    mininumVirus = virusArr.size();

    makeWall(0);
    System.out.println(maxSafetyCount);
  }

  public static void makeWall(int newWallCnt) {
    tmpMap = map;

    if ( newWallCnt == 3 ) {
      int finalVirus = calcVirus(tmpMap);
      int emptyCount = M*N - (virusArr.size() + wallArr.size());
      int safetyZone = emptyCount - finalVirus - 3;
      maxSafetyCount = Math.max(maxSafetyCount, safetyZone);
      return ;
    }


    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (tmpMap[i][j] == 0) {
          tmpMap[i][j] = 3;
          makeWall(newWallCnt++);
        }
      }
    }
  }

  /* spreadVirus로 보낼 시작값을 설정하는 함수. 각 시작값에 따른 바이러스의 개수를 반환 */
  /* 시작값은 현재에 map[x][y]가 2인 포인트가 되겠지 */
  public static int calcVirus(int[][] tmpMap){
    int currentVirusCnt = 0;
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (tmpMap[i][j] == 0 && map[i][j] == 2) {
          currentVirusCnt += spreadVirus(new Point(i,j));
        }
      }
    }
    return currentVirusCnt;
  }

  /* spreadVirus에서는 현재의 바이러스러부터 '퍼질 수 있는' 바이러스만 계산하기 위하여 분리해준다. */
  /* 여기서 BFS를 적용 */
  /* queue에 들어가는 point는 각각에서 상하좌우 bfs를 진행할 point*/
  public static int spreadVirus(Point point){

    int virusCount = 1;

    Queue<Point> queue = new LinkedList<Point>();
    queue.add(point);
    tmpMap[point.x][point.y] = 1;

    while(!queue.isEmpty()){
      Point current  = queue.poll();

      // 이걸 해주는 이유는, queue에 들어와있는 point는 2 이니까! 주변을 탐색해야함
      for (int[] move : moves) {
        int nextX = current.x + move[0];
        int nextY = current.y + move[1];

        // 바이러스를 퍼트릴 수 있는 점에 퍼트리고, 그 주변 공간을 큐에 담아 탐색가능하도록 함
        if (isMoveable(nextX, nextY)) {
          tmpMap[nextX][nextX] = 1;
          queue.add(new Point(nextX, nextY)); //그 주변의 주변을 탐색하도록 큐에 넣어줌
          virusCount++;
        }
      }

    }





//    int currentX = point.x;
//    int currentY = point.y;
//
//    Queue<Point> queue = new LinkedList<Point>();
//    queue.add(point);
//
//    tmpMap[point.x][point.y] = 1;
//    while (!queue.isEmpty()) {
//      Point current = queue.poll();
//
//      // current Point의 상하좌우를 모두 탐색할 수 있다.
//      if (isMoveable(currentX, currentY)) {
//        for (int[] move : moves) {
//          currentX = currentX + move[0];
//          currentY = currentY + move[1];
//        }
//      }
//    }

    return virusCount;
  }

  public static boolean isMoveable(int x, int y) {
    if (tmpMap[x][y] == 0 && map[x][y] == 0 && x == 0 && x < M && y == 0 && y < N) {
      return true;
    }
    return false;
  }
}
