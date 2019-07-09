package More.baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LottoOther {
  static int K;
  static Integer[] iArr;
  static int count;
  static StringBuffer sb= new StringBuffer();
  static void dfs(int v, String str) {
    if(count == 6) {
      sb.append(str + '\n');
    } else {
      for (int i = v + 1; i <K; i++) {
        count++;
        dfs(i, str + iArr[i] + " ");
      }
    }
    count--;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while((K = sc.nextInt()) != 0){
      iArr = new Integer[K];
      for (int i = 0; i < K; i++) {
        iArr[i] = sc.nextInt();
      }
      for (int i = 0; i < K; i++) {
        count =  1;
        dfs (i, iArr[i] + " ");
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
