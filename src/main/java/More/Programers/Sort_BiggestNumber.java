package More.Programers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* 미완성. CompareTo, Compare 공부 필요*/

public class Sort_BiggestNumber {

  public static void main(String[] args) throws Exception {
   // int[] numbers1 = {6, 10, 2};
    int[] numbers2 = {3, 30, 34, 5, 9};
    int[] numbers3 = {3, 30, 31, 34};
    System.out.println(solution(numbers2));
    Arrays.sort(numbers3);
    System.out.println(Arrays.toString(numbers3));
  }

  public static String solution(int[] numbers) {
    String answer = "";
    int bigger = numbers[0];

    List<String> strs = new ArrayList<String>();
    for (int i = 0; i < numbers.length; i++) {
      strs.add(Integer.toString(numbers[i]));
    }

    Collections.sort(strs);

    for (int i = strs.size() -1 ; i >= 0; i--) {
      answer += strs.get(i);
    }
    return answer;
  }
}
//6210
//9534330
