package baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 시간초과
//2차원 배열의 경우, 그 index를 어디에 저장할 것인가?
public class Sticker_9465 {

    static int testCase;
    static int n;
    static int count;
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};
    static int arr[][];
    static boolean visited[][];
    static List<Integer> sorted;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());

        while (testCase > 0) {
            testCase--;
            count = 0;
            n = Integer.parseInt(br.readLine());

            arr = new int[2][n];
            visited = new boolean[2][n];
            sorted = new ArrayList<Integer>();

            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    sorted.add(arr[i][j]);
                }
            }

            Collections.sort(sorted);
            Collections.reverse(sorted);

            for (int k = 0; k < sorted.size(); k++) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < n; j++) {
                        if (arr[i][j] == sorted.get(k)) {
                            if (arr[i][j] != -1 && visited[i][j] == false) {
                                visited[i][j] = true;
                                count += sorted.get(k);
                                move(i, j);
                                break;
                            }
                        }
                    }
                }

            }

            System.out.println(count);
        }
    }

    public static void move(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newY >= 0 && newX < 2 && newY < n && arr[newX][newY] != -1) {
                arr[newX][newY] = -1;
            }
        }
    }

}
