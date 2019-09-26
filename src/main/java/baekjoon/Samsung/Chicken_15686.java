package baekjoon.Samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Chicken_15686 {

    static int N;
    static int M;
    static int map[][];
    static int visited[][];
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static Point home;
    static Map<Point, Integer> chickenLengths = new HashMap<Point, Integer>();
    static List<Integer> lengths = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N + 1][N + 1];
        visited = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                map[i][j + 1] = Integer.parseInt(str[j]);
            }
        }

        //각각의 집에서의 치킨거리를 구하기 => 각 집의 좌표에 따른 치킨거리를 저장
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] == 1) {
                    home = new Point(i, j);
                    chickenLengths.put(home, N * N + N);
                    solve(i, j);
                }
            }
        }

        //구한 치킨거리를 배열로 만들어 오름 차순으로 정렬
        System.out.println(chickenLengths);

        //M개의 개수만큼 배열으 합을 구하기

    }

    public static void solve(int x, int y) {
        visited[x][y] = 1;
        Queue<Point> queue = new LinkedList<Point>();
        queue.offer(new Point(x, y));

        while (!queue.isEmpty()) {
            Point p = queue.remove();

            if (map[p.x][p.y] == 2) {
                int length = Math.abs(home.x - p.x) + Math.abs(home.y - p.y);
                if (chickenLengths.get(home) > length) {
                    chickenLengths.put(home, length);
                }
            }

            for (int k = 0; k < 4; k++) {
                int newX = x + dx[k];
                int newY = y + dy[k];
                if (newX >= 1 && newY >= 1 && newX <= N && newY <= N && visited[newX][newY] != 1) {
                    visited[newX][newY] = 1;
                    queue.offer(new Point(newX, newY));
                }
            }
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
