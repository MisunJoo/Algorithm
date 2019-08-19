package baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeOne_1463 {

    static int N;
    static int[] d;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        d = new int[1000001];

        d[2] = 1;
        d[3] = 1;
        solve();
        System.out.println(d[N]);
    }

    public static void solve() {

        for (int i = 4; i <= N; i++) {
            int[] answer = {-1, -1, -1};

            answer[0] = d[i - 1] + 1;

            if (i % 3 == 0) {
                answer[1] = d[i / 3] + 1;
            }

            if (i % 2 == 0) {
                answer[2] = d[i / 2] + 1;
            }

            Arrays.sort(answer);

            for (int j = 0; j < 3; j++) {
                if (answer[j] != -1) {
                    d[i] = answer[j];
                    break;
                }
            }
        }
    }
}
