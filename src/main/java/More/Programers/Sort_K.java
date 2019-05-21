package More.Programers;

import java.util.Arrays;

public class Sort_K {

  public static void main(String[] args) throws Exception {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    System.out.println(Arrays.toString(solution(array, commands)));
  }

  public static int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
      int index = commands[i][2];
      Arrays.sort(copy);
      answer[i] = copy[index - 1];
    }
    return answer;
  }
}
//5,6,3
