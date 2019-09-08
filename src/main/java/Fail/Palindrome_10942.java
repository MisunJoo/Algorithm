package Fail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//d의 초기값 -1
//팰린드롬이 아닌 값 0
//팰린드롬인 값 1

// 덜풀음 : 짝수 length의 경우 추가
public class Palindrome_10942 {

    static int N;
    static int a[];
    static int d[][];
    static int M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        a = new int[N + 1];
        d = new int[N + 1][N + 1];

        // 초기값은 모두 -1로 초기화
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                d[i][j] = -1;
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        // S==E인 경우의 회문 초기화
        for (int i = 1; i <= N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            d[i][i] = 1;
        }

        M = Integer.parseInt(br.readLine());
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            solve(S, E);
        }
        System.out.println(d);

    }

    public static void solve(int S, int E) {
        // 홀수일 때
        if ((E - S + 1) % 2 == 1) {
            for (int i = (E - S + 1) / 2; i >= 0; i--) {
                if (d[S + i][E - i] == 1) { // 회문일 때
                    continue;
                } else if (d[S + i][E - i] == 0) { // 회문이 아닐 때
                    System.out.println(0);
                    return;
                } else if (d[S + i][E - i] == -1) { //회문인지 아닌지 계산하지 않았을
                    if (a[S + i] == a[E - i]) {
                        d[S + i][E - i] = 1;
                        d[E - i][S + i] = 1;
                    } else {
                        d[S + i][E - i] = 0;
                        d[E - i][S + i] = 0;
                        System.out.println(0);
                        return;
                    }
                }
            }
            System.out.println(d[S][E]);
        }

        // 짝수일 때
    }

}
