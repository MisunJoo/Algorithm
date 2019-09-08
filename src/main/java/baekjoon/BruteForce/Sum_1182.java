package baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_1182 {

    static int N;
    static int S;
    static int[] a;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        a = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);


    }

    public static void dfs(int sum, int idx, int dept) {
        if (idx >= N) {
            return;
        }
        if (sum + a[idx] == S) {
            count++;
            return;
        } else {
            for (int i = 0; i < dept; i++) {
                System.out.print("\t");
            }
            System.out.println(a[idx] + ":" + sum);

            sum += a[idx];
            dfs(sum, idx + 1, dept + 1);
        }
    }

}
