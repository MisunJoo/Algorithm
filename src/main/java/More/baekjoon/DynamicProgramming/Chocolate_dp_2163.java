package More.baekjoon.DynamicProgramming;

import java.util.Scanner;

public class Chocolate_dp_2163 {
  static int[][] memo = new int[301][301];
  static void initMemo(int[][] memo){
    for (int i = 0; i < memo.length; i++) {
      for (int j = 0; j < memo[i].length; j++) {
        memo[i][j] = 0;
      }
    }
    for (int i = 2; i < memo[1].length; i++) {
      memo[1][i] = i - 1;
    }

  }

  static int cuttint(int n, int m) {
    if ( n == 1) {
      return memo[n][m];
    }
    return cuttint(n-1, m) + memo[1][m] + 1;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    initMemo(memo);
    System.out.println(cuttint(n, m));
  }

}
