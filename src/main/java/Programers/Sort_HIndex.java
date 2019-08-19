package More.Programers;

public class Sort_HIndex {

  public static void main(String[] args) throws Exception {
    int[] citations = {10, 50, 100};
    System.out.println(solution(citations));
  }
  public static int solution(int[] citations) {
    int answer = 0;
    int citeCount;
    int restCount;

    if (citations.length == 1) {
      return answer = 1;
    }
    for (int i = 0; i <= citations.length; i++) {
      citeCount = 0;
      restCount = 0;

      for (int j = 0; j < citations.length; j++) {
        if (citations[j] >= i) {
          citeCount++;
        } else if (citations[j] <= i) {
          restCount++;
        }
      }
      if (citeCount >= i && restCount <= i) {
        answer = i;
      }
    }
    return answer;
  }
}