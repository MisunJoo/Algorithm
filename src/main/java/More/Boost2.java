package More;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boost2 {

  public static void main(String[] args) {
    int[] arr1 = {1, 4, 1, 3, 5, 6, 10};
    int[] arr2 = {9, 2, 3, 1, 3, 4, 10};
    System.out.println(solution(arr1, arr2));
  }

  public static int solution(int[] arr1, int[] arr2) {
    int answer = 0;

    List<Integer> arrList1 = new ArrayList<Integer>();
    List<Integer> arrList2 = new ArrayList<Integer>();
    final HashMap<Integer, Integer> arrMap1 = new HashMap<Integer, Integer>();
    final HashMap<Integer, Integer> arrMap2 = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr1.length; i++) {
      arrList1.add(arr1[i]);
    }
    int arrList1Len = arrList1.size();

    for (int i = 0; i < arr2.length; i++) {
      arrList2.add(arr2[i]);
    }
    int arrList2Len = arrList2.size();

    //비교하여 map에 채우기
    for (int i = 0; i < arrList1Len; i++) {
      for (int j = i + 1; j < arrList1Len; j++) {
        if (arrList1.get(i) == arrList1.get(j)) {

          if (arrMap1.get(arrList1.get(i)) == null) {
            arrMap1.put(arrList1.get(i), 2);
          } else {
            arrMap1.put(arrList1.get(i), arrMap1.get(i) + 1);
          }
        }
      }
    }

    for (int i = 0; i < arrList2Len; i++) {
      for (int j = i + 1; j < arrList2Len; j++) {
        if (arrList2.get(i) == arrList2.get(j)) {

          if (arrMap2.get(arrList2.get(i)) == null) {
            arrMap2.put(arrList2.get(i), 2);
          } else {
            arrMap2.put(arrList2.get(i), arrMap2.get(i) + 1);
          }
        }
      }
    }

    List<Integer> keySetList1 = new ArrayList<Integer>(arrMap1.keySet());
    // 내림차순 //
    Collections.sort(keySetList1, new Comparator<Integer>() {

      @Override
      public int compare(Integer o1, Integer o2) {
        return arrMap1.get(o2).compareTo(arrMap1.get(o1));
      }
    });

    List<Integer> keySetList2 = new ArrayList<Integer>(arrMap2.keySet());
    // 내림차순 //
    Collections.sort(keySetList2, new Comparator<Integer>() {

      @Override
      public int compare(Integer o1, Integer o2) {
        return arrMap2.get(o2).compareTo(arrMap2.get(o1));
      }
    });

    
    //map의 키값으로 비교하기

    if (arrMap1.size() == 0 || arrMap2.size() == 0) {
      answer = 0;
    } else if (keySetList1.get(0) > keySetList2.get(0)) {
      answer = 1;
    } else if (keySetList1.get(0) < keySetList2.get(0)) {
      answer = 2;
    } else {
      answer = 0;
    }
    return answer;
  }

}
