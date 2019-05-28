package More.Programers;

import java.util.Arrays;

public class StackQueueStockPrice {

  public static void main(String[] args) throws Exception {
    int[] prices = {1, 2, 3, 2, 3};
    System.out.println(Arrays.toString(solution(prices)));

  }

  public static int[] solution(int[] prices) {
    int[] answer = new int[prices.length];

    for (int i = 0; i < prices.length - 1; i++) {
      int count = 0;
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] <= prices[j]) {
          count++;
        } else {
          count++;
          break;
        }
      }
      answer[i] = count;
    }

    answer[prices.length - 1] = 0;

    return answer;
  }

}
//[4, 3, 1, 1, 0]