package More.baekjoon.DFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindRoute {
  static int N;
  static char[][] map;
  static boolean[][] visited;
  static int finalWeek;
  static int finalStrong;
  static Queue<Point> q = new LinkedList<Point>();
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0 ,0, 1, -1};

  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    N = Integer.parseInt(st.nextToken());
    map = new char[N][N];
    visited = new boolean[N][N];

    for (int i = 0; i < N; i++) {
      map[i] = bf.readLine().toCharArray();
    }

    finalStrong = solve();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == 'R') map[i][j] = 'G';
      }
    }
    visited = new boolean[N][N];
    finalWeek = solve();

    System.out.println(finalStrong+" "+finalWeek);


  }

  static int solve() {
    int cnt = 0;

    for (int i = 0; i < N ; i++)
      for (int j = 0; j < N; j++) {
        if (visited[i][j]) {
          continue;
        }

        q.add(new Point(i, j));

        while (!q.isEmpty()) {
          Point cur = q.poll();

          for (int k = 0; k < 4; k++) {
            int newX = cur.x + dx[k];
            int newY = cur.y + dy[k];

            if (!isRange(newX, newY) || visited[newX][newY] || (map[i][j] != map[newX][newY])) {
              continue;
            }

            visited[newX][newY] = true;
            q.add(new Point(newX, newY));
          }
        }
        cnt++;
      }
    return cnt;
  }

  static boolean isRange(int x, int y) {
    if ( x < 0 || x >= N || y < 0 || y >= N) return false;
    return true;
  }
}
