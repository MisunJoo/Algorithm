package baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sticker_dp_9465 {

    static int testCase;
    static int n;
    static int a[][];
    static int d[][];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        while (testCase > 0) {
            testCase--;
            n = Integer.parseInt(br.readLine());
            a = new int[2][n + 1];
            d = new int[2][n + 1];

            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            d[0][1] = a[0][1];
            d[1][1] = a[1][1];

            for (int j = 2; j <= n; j++) {
                d[0][j] = Math.max(d[1][j - 2], d[1][j - 1]) + a[0][j];
                d[1][j] = Math.max(d[0][j - 2], d[0][j - 1]) + a[1][j];
            }

            System.out.println(Math.max(d[0][n], d[1][n]));
        }

    }
}
