package More.Programers;

import java.util.PriorityQueue;

public class Scovile {

  public static void main(String[] args) throws Exception {
    int[] scovile = {1, 2, 3, 9, 10, 12};
    int K = 7;
    System.out.println(Integer.toString(solution(scovile, K)));
  }

  public static int solution(int[] scoville, int K) {
    int answer = 0;
    int smallest = 0;
    int secondSmallest = 0;
    int mixed = 0;

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (int i = 0; i < scoville.length; i++) {
      pq.offer(scoville[i]);
    }

    while (pq.peek() < K) {
      if (pq.size() == 1) {
        return -1;
      }

      smallest = pq.poll();
      secondSmallest = pq.poll();

      mixed = smallest + (secondSmallest * 2);
      pq.offer(mixed);
      answer++;
    }

    return answer;
  }
}
