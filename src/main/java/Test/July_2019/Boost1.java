package Test.July_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boost1 {

  public static void main(String[] args) {
    int[] param = {3, 5, 7, 9, 1};
    System.out.println(Arrays.toString(solution(param)));
  }

  public static int[] solution(int[] param) {
    int[] answer;
    Map<Integer, Integer> answerArr = new HashMap<Integer, Integer>();
    List<Integer> paramArr = new ArrayList<Integer>();
    List<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < param.length; i++) {
      if (paramArr.contains((Integer) param[i])) {
        if (answerArr.get(param[i]) == null) {
          answerArr.put(param[i], 2);
        } else {
          answerArr.put(param[i], answerArr.get(param[i]) + 1);
        }
      }
      paramArr.add(param[i]);
    }

    if (answerArr.size() != 0) {
      int length = answerArr.size();
      answer = new int[length];

      for (Integer v : answerArr.values()) {
        list.add(v);
      }

      for (int i = 0; i < length; i++) {
        answer[i] = list.get(i);
      }
    } else {
      answer = new int[1];
      answer[0] = -1;
    }
    return answer;
  }


}
