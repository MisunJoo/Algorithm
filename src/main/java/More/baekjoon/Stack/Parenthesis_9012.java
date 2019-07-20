package More.baekjoon.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Parenthesis_9012 {
  static int testCase;
  static Stack<Character> stack;
  static char[] chars;
  static List<String> answer = new ArrayList<String>();

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    testCase = Integer.parseInt(st.nextToken());

    for (int i = 0; i < testCase; i++) {
      stack = new Stack<Character>();

      st = new StringTokenizer(br.readLine());
      chars = st.nextToken().toCharArray();

      for (char ch : chars) {
        if (!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
          stack.pop();
        } else {
          stack.push(ch);
        }
      }

      if (stack.isEmpty()) {
        answer.add("YES");
      } else {
        answer.add("NO");
      }
    }

    for (int i = 0; i < answer.size(); i++) {
      System.out.println(answer.get(i));
    }
  }

}
