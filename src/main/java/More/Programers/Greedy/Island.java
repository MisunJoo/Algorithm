package More.Programers.Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Island {
  public static void main(String[] args) {
    int n = 4;
    int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
    System.out.println(Integer.toString(solution(n, costs)));
  }
  public static int solution(int n, int[][] costs) {
    int answer = 0;
    boolean visited[] =  new boolean[4];

    PriorityQueue<Integer> islandNumber = new PriorityQueue<Integer>();

      int min = costs[0][2];

      for( int i = 0; i < costs.length; i++) {
        if (costs[i][2] < min && costs[i][2] != -1) {
          min = costs[i][2];
          visited[costs[i][0]] = true;
          visited[costs[i][1]] = true;
          answer += min;

          islandNumber.add(costs[i][0]);
          islandNumber.add(costs[i][1]);
          costs[i][2] = -1;
        }
      }

      for (int i = 0; i < costs.length; i++) {
        if (islandNumber.peek() == costs[i][0] && costs[i][0] != -1 ) {
          min = costs[i][2];
        }
    }


    return answer;
  }
}
