package More.Programers.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Camera {
  public static void main(String[] args) {
    int[][] routes = {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}};
    System.out.println(Integer.toString(solution(routes)));
  }

  public static int solution(int[][] routes) {
    int answer = 0;
    int camera = 0;
    int count =0;
    List<Integer> lists = new ArrayList<Integer>();
    HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

    Arrays.sort(routes, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });

    for (int i = 0; i < routes.length; i++) {
      count = 0;
      for (int j = 0; j < routes.length; j++) {
        if (routes[i][0] >= routes[j][0] && routes[i][0] <= routes[j][1]) {
          lists.add(i);
          count++;
        }
      }
      map.put(routes[i][0], lists);
    }
    System.out.println(map);
    return answer;
  }
}
