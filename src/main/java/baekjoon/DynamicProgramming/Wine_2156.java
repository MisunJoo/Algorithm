package baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*https://www.acmicpc.net/board/view/21703#comment-37134*/
public class Wine_2156 {

    static int n;
    static int[] a;
    static int[] d;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        d = new int[n + 1];
        a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        d[0] = 0;
        d[1] = a[1];

        if (n >= 2) {
            d[2] = a[1] + a[2];

            for (int i = 3; i <= n; i++) {
                d[i] = Math.max(d[i - 1], Math.max(d[i - 3] + a[i - 1] + a[i], d[i - 2] + a[i]));
            }
        }

        System.out.println(d[n]);
    }
}
