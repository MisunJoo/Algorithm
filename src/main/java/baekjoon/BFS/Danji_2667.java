package baekjoon.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/*
*  Queue에 저장하는 이유는, 그 포인트부터 갈 수 있는 포인트가 있으면 저장해두려고!
* */

public class Danji_2667 {

    static int N;
    static int map[][];
    static int visited[][];
    // (0,1), (0,-1), (1,0), (-1,0) x x y y
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static List<Integer> danji = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new int[N][N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && visited[i][j] == 0) {
                    bfs(i, j);
                }
            }
        }

        Collections.sort(danji);
        System.out.println(danji.size());
        for (int i : danji) {
            System.out.println(i);
        }
    }

    public static void bfs(int x, int y) {
        int count = 1;
        Queue<Point> que = new LinkedList<Point>();
        que.add(new Point(x, y));
        visited[x][y] = 1;

        while (!que.isEmpty()) {
            Point p = que.poll();

            // 현재 정점에서 이동할 수 있는 것을 이동하여 탐색
            for (int i = 0; i < 4; i++) {
                int newX = p.x + dx[i];
                int newY = p.y + dy[i];

                if (isMoveable(newX, newY) && visited[newX][newY] == 0) {
                    que.add(new Point(newX, newY));
                    count++;
                    visited[newX][newY] = 1;
                }
            }
        }

        danji.add(count);
    }

    public static boolean isMoveable(int x, int y) {
        if (x >= 0 && y >= 0 && y <= N - 1 && x <= N - 1 && map[x][y] == 1) {
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
