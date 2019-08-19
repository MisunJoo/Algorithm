package More.Programers.Greedy;

import java.util.Stack;

public class BigNumber {

  public static void main(String[] args) {
    String number = "4177252841";
    int k = 4;
    System.out.println(solution(number, k));

  }

  public static String solution(String number, int k) {
    char[] result = new char[number.length() - k];
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < number.length(); i++) {
      char c = number.charAt(i);
      while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
        stack.pop();
      }
      stack.push(c);
    }
    for (int i = 0; i < result.length; i++) {
      result[i] = stack.get(i);
    }
    return new String(result);

//    String answer = "";
//    int count = 0;
//    List<Integer> compareArr = new ArrayList<Integer>();
//    List<Integer> numberArr = new ArrayList<Integer>();
//
//    for (int i = 0; i < number.length(); i++) {
//      compareArr.add(number.charAt(i) - '0');
//      numberArr.add(number.charAt(i) - '0');
//    }
//
//    Collections.sort(compareArr);
//    int originSize = numberArr.size();
//
//    for (int i = 0; i < originSize && count < k; i++) {
////      if (numberArr.size() == originSize - k) break;
//      if (numberArr.get(i) <= compareArr.get(k - 1)) {
////        numberArr.remove(i);
//        numberArr.set(i, -1);
//        count++;
//      }
//    }
//
//    for (int i = 0; i < originSize; i++) {
//      if (numberArr.get(i) != -1) {
//        answer += numberArr.get(i);
//      }
//    }

//    return answer;
  }
}
