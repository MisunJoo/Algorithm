package More.baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chocolate_2163 {
  static int N;
  static int M;
  static int answer = 0;

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

//      solve(N, M);

      answer = (N - 1) + N * (M-1);

    System.out.println(answer);
  }

//  static void solve(int N, int M) {
//    if ( N != 1 ) {
//      N = N / 2;
//      solve(N, M);
//      answer++;
//    }
//  }

}

