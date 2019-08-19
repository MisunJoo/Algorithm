package More.Programers.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scale {
  public static void main(String[] args) {
    int[] weight = {3, 1, 6, 2, 7, 30, 1};
    System.out.println(Integer.toString(solution(weight)));

  }
  public static int solution(int[] weight) {
    int answer = 1;
    Arrays.sort(weight);

    for(int w : weight) {
      if(answer < w)
        break;
      answer += w;
    }

    return answer;
  }
}
