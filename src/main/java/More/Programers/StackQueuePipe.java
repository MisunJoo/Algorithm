package More.Programers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StackQueuePipe  {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(solution(bf.readLine()));

  }

  public static int solution(String arrangement) {
    int answer = 0;

    String removeLaser = arrangement.replace("()", "0");
    ArrayList<Character> removeLaserArr = new ArrayList<Character>();

    for(int i = 0; i < removeLaser.length(); i++){
      removeLaserArr.add(removeLaser.charAt(i));
    }

    ArrayList<Character> stack = new ArrayList<Character>();

    for (int i = 0; i < removeLaserArr.size(); i++) {
      if (removeLaserArr.get(i) == '(') {
        stack.add(removeLaserArr.get(i));
      } else if (removeLaserArr.get(i) == ')') {
        stack.remove(stack.size() - 1);
        answer += 1;
      } else if (removeLaserArr.get(i) == '0') {
        answer += stack.size();
      }
    }

    return answer;
  }
}
