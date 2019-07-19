package More.Programers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {

  public static void main(String[] args) throws Exception {
    int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
    System.out.println(solution(jobs));
  }

  public static int solution(int[][] jobs) {
    int answer = 0;
    int sum = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    Arrays.sort(jobs, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[1] - o2[1];
      }
    });

    for (int i = 0; i < jobs.length; i++) {
      pq.offer(jobs[i][1]);
    }

    for (int i = 0; i < jobs.length; i++) {
      answer = answer + (sum - jobs[i][0]) + pq.peek();
      sum = sum + pq.poll();
    }

    answer /= jobs.length;
    return answer;
  }
}

/*
 * 1. 열이 작은 순서대로 우선순위큐에 넣는다. -> 이 순대로 배치해야 빨라짐
 * 2. 대기시간 구하기 : 대기 시간만을 저장하는 배열 하나 선언, 시작시간을 저장하는 배열 하나 선언, 현재시간을 저장하는 배열하나
 * 3. (0+3) + (3-2 + 6) + ( 9 -1 + 9)
 * 4.
 * */
