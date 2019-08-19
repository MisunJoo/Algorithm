package More.Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {

  public static void main(String[] args) throws Exception {
    int[] answers = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(solution(answers)));
  }

  public static int[] solution(int[] answers) {
    int[] answer = {};
    int[] student1 = {1, 2, 3, 4, 5};
    int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] answerCount = new int[3];

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == student1[i % 5]) {
        answerCount[0]++;
      }
      if (answers[i] == student2[i % 8]) {
        answerCount[1]++;
      }
      if (answers[i] == student3[i % 10]) {
        answerCount[2]++;
      }
    }

    int max = answerCount[0];
    for (int i = 0; i < answerCount.length; i++) {
      if (max < answerCount[i]) {
        max = answerCount[i];
      }
    }

    List<Integer> winner = new ArrayList<Integer>();

    for (int i = 0; i < answerCount.length; i++) {
      if (max == answerCount[i]) {
        winner.add(i);
      }
    }

    answer = new int[winner.size()];

    for (int i = 0; i < winner.size(); i++) {
      answer[i] = winner.get(i) + 1;
    }

    return answer;
  }
}
