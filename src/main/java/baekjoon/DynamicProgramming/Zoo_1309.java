package baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* dp를 풀때 꼭 '규칙'을 찾으려고 하지 말자. 시간 오래걸리고 더 복잡할 수 있음
 * d[][]와 같이 2차원 배열로 만든다면, 경우의 수 조건을 저장할 수 있음
 * N = 1인 경우를 일단 저장해놓자. 이는 반드시 쓰임!
 * 그 다음으로는 N = 2 인경우를 생각해보자
 * dp는 n-1 번째까지가 완벽히 계산되었다고 가정했을 때~ 를 말함
 * http://isukorea.com/blog/home/waylight3/77
 * https://yabmoons.tistory.com/137
 * */
public class Zoo_1309 {

    static final int Moduler = 9901;
    static int N;
    static int[][] d = new int[100001][3];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        d[1][0] = d[1][1] = d[1][2] = 1;

        for (int i = 2; i <= N; i++) {
            d[i][0] = (d[i - 1][0] + d[i - 1][1] + d[i - 1][2]) % Moduler;
            d[i][1] = (d[i - 1][0] + d[i - 1][2]) % Moduler;
            d[i][2] = (d[i - 1][0] + d[i - 1][1]) % Moduler;
        }
        System.out.println((d[N][0] + d[N][1] + d[N][2]) % Moduler);
    }
}
