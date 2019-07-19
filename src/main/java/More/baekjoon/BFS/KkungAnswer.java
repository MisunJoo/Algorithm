package More.baekjoon.BFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class KkungAnswer {
  static int R, C;
  static char[][] map;
  static boolean[][] visited;
  static int[] dx = {0, 0, 1, -1};
  static int[] dy = {1, -1, 0, 0};
  static int sheep;
  static int wolf;
  static Queue<Point> q = new LinkedList<Point>();
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());

    map = new char[R][C];
    visited = new boolean[R][C];

    for (int i = 0; i < R; i++) {
      map[i] = br.readLine().toCharArray();
    }

    for (int i = 0; i < R; i++) {
      for (int j = 0; j <C; j++) {
        if (map[i][j] == '#' || visited[i][j]) continue;
        bfs(i, j);
      }
    }
    System.out.println(sheep+" "+wolf);
  }

  static void bfs(int x, int y) {
    int v = 0;
    int k = 0;
    visited[x][y] = true;
    q.add(new Point(x, y));

    while (!q.isEmpty()){
      Point cur = q.poll();
      if (map[cur.x][cur.y] == 'v') v++;
      if (map[cur.x][cur.y] == 'k') k++;

      for (int i = 0; i < 4; i++) {
        int nx = cur.x + dx[i];
        int ny = cur.y + dy[i];

        if (!isRange(nx, ny) || visited[nx][ny] || map[nx][ny] == '#') continue;

        visited[nx][ny] = true;
        q.add(new Point(nx, ny));
      }
      if ( v >= k) {
        wolf += v;
      } else {
        sheep += k;
      }
    }

  }

  static boolean isRange(int x, int y) {
    if ( x < 0 || x >= R || y < 0 || y >= C) return false;
    return true;
  }

}
