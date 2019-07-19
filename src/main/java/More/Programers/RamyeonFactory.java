package More.Programers;

public class RamyeonFactory {
  public static void main(String[] args) {
    int stock = 4;
    int[] dates = {4, 10, 15};
    int[] supplies = {20, 5, 10};
    int k = 30;
    System.out.println(Integer.toString(solution(stock, dates, supplies, k)));
  }
  public static int solution(int stock, int[] dates, int[] supplies, int k) {
    int answer = 0;

  stock -= dates[0];

    for ( int i = 0; i < dates.length -1; i++ ) {
      if ( (dates[i+1] - dates[i] + 1) > stock) {
        stock += supplies[i];
        answer++;
      }
    }

    if ( k - dates[dates.length -1] + 1 < stock) {
      answer++;
    }

    return answer;
  }
}

/*
* 음..
* 1. dates의 첫번째 공급일이 오기 전까지의 수량을 구한다.
* 2. 두번째 공급일이 올 때까지의 수량을 구한다.
* 3. 세 번째 공급일이 올 때까지 수량이 남는다면 공급받지 않아도 된다.
* 3.5. 두 번째 공급받은게 세 번째 공급일까지 부족하지 않은 경우를 구해야한다.
* 4. 마지막 공급일은 k-1 일이 올 때 까지 충분해야된다.
* */
