package More.baekjoon.DFS;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
*  ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
    for (int i=1; i<=n; i++) {
      a[i] = new ArrayList<Integer>();
    }
* */
public class Cabbage {
  static int testCase;
  static int M;
  static int N;
  static int K;
  static int[][] field;
  static int[][] visited;
  static List<Integer> answer;
  static int first;
  static int second;
  static int dx[] = {0, 0, 1, -1};
  static int dy[] = {1, -1, 0, 0};
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    testCase = Integer.parseInt(st.nextToken());
    answer = new ArrayList<Integer>();

    while (testCase > 0) {
      int earthworm = 0;
      testCase--;
      st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      K = Integer.parseInt(st.nextToken());

      field = new int[N][M];
      visited = new int[N][M];

      for (int i = 0; i < K; i++) {
        st = new StringTokenizer(br.readLine());

        first = Integer.parseInt(st.nextToken());
        second = Integer.parseInt(st.nextToken());
        field[first][second] = 1;
      }

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          if (field[i][j] == 1 && visited[i][j] == 0) {
            dfs(i, j);
            earthworm++;
          }
        }
      }
      answer.add(earthworm);
    }

    for (int i = 0; i < answer.size(); i++){
      System.out.println(answer.get(i));
    }
  }

  public static void dfs(int x, int y){
    visited[x][y] = 1;

    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if (!isRange(nx, ny) && field[nx][ny] == 1 && visited[nx][ny] == 0) {
        dfs(nx, ny);
      }
    }
  }

  public static boolean isRange(int x, int y){
    if ( x < 0 || x >= N || y < 0 || y >= M) return true;
    else return false;
  }


}
