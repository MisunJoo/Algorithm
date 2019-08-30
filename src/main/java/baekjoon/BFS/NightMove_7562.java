package baekjoon.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
* 처음에는 visited를 안써줘도 되지 않나?라고 생각했다.
* 하지만 방문여부를 체크해주지 않으면 영원히 끝나지 않는다,,,
* */

public class NightMove_7562 {

    static int testCase;
    static int l;
    static int[][] chess;
    static int[][] dept;
    static int[][] visited;
    static int[] dx = {-1, -1, 1, 1, -2, -2, 2, 2};
    static int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};
    static Point from;
    static Point to;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());

        while (testCase > 0) {
            testCase--;
            l = Integer.parseInt(br.readLine());
            chess = new int[l][l];
            dept = new int[l][l];
            visited = new int[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            from = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            to = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            bfs(from.x, from.y);
            System.out.println(dept[to.x][to.y]);
        }
    }

    public static void bfs(int x, int y) {
        Queue<Point> que = new LinkedList<Point>();
        que.add(new Point(x, y));
        dept[x][y] = 0;
        visited[x][y] = 1;

        while (!que.isEmpty()) {
            Point p = que.poll();

            for (int i = 0; i < 8; i++) {
                int newX = p.x + dx[i];
                int newY = p.y + dy[i];

                if (moveable(newX, newY) && visited[newX][newY] == 0) {
                    dept[newX][newY] = dept[p.x][p.y] + 1;
                    que.add(new Point(newX, newY));
                    visited[newX][newY] = 1;
                }

                if (newX == to.x && newY == to.y) {
                    return;
                }
            }
        }


    }

    public static boolean moveable(int x, int y) {
        if (x >= 0 && y >= 0 && x < l && y < l) {
            return true;
        } else {
            return false;
        }
    }

    public static class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
