package More.baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BulkHouse_2292 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    int sum = 1;
    int count = 1;

    for (int i = 0; sum<input; i += 6, sum=sum+i){
      count++;
    }
    System.out.println(count);
  }
}

//6, 18, 36, 60
//6*0+1 // 6*1+1 6*
// 1 7 19 37 61
// 13 = 2 +1 58 = 4+1
// 6 12 18 24 // 1 + 6 + 12 + 18 + 24
// 6 * 0 + 6 * 1  + 6 * 2 + 6 * 3 + 6 * 4
// 1
