package baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Decreasing_11722 {
  static int len;
  static int[] arr;
  static int[] answer;
  static boolean[] visited;
  static int count = 1;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    len = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[len];
    answer = new int[len];
    visited = new boolean[len];
    for (int i = 0; i < len; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < len; i++) {
      answer[i] = solve(i);
      count = 1;
    }

    Arrays.sort(answer);

    System.out.println(answer[len - 1]);
  }

  public static int solve(int i){
    for (int j = i + 1; j < len; j++) {
      if ( arr[i] > arr[j] && (visited[j] == false)) {
        visited[j] = true;
        count++;
        solve(j);
      }
    }
    return count;
  }
}


