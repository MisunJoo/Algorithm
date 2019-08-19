package More.baekjoon.DFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfdAndBfs_1260 {
  static int N;
  static int M;
  static int V;
  static int first;
  static int second;
  static boolean[][] map;
  static boolean[] visited;
  static Queue<Integer> queue = new LinkedList<Integer>();

  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    V = Integer.parseInt(st.nextToken());

    map = new boolean[N+1][N+1];
    visited = new boolean[N + 1]; //visited는 1번째방부터 N번째방까지

    for (int i = 0; i < M; i ++) {
      st = new StringTokenizer(bf.readLine());
      first = Integer.parseInt(st.nextToken());
      second =  Integer.parseInt(st.nextToken());
      map[first][second] = true;
      map[second][first] = true;
    }

    dfs(V);
    System.out.println();
    bfs(V);

  }

  // 깊이 우선 탐색 -> 타고 -> 타고 들어가기
  public static void dfs(int V){
    visited[V] = true;

    System.out.print(V + " ");
    for (int i = 1; i <= N; i++) {
      if (visited[i] == true || map[i][V] == false)
        continue;
      dfs(i);
    }
  }

  // 한 정점의 인접을 계속 쌓아두기 위해서 queue를 사용.
  // 그러니까, 연결된 것을 다 쌓아두는구나. 거기서 타고타고 들어가는것이아니라!
  public static void bfs(int V){
    visited[V] = false;
    queue.add(V);


    while( ! queue.isEmpty()) {
      int num = queue.poll();
      System.out.print(num + " ");

      //map[i][num]을 해줘야, num과 연관된 접점을 검사할 수 있음
      for (int i =1; i <= N; i++) {
        if (visited[i] == false || map[i][num] == false)
          continue;
        visited[i] = false;
        queue.add(i);
      }

    }
  }


}
