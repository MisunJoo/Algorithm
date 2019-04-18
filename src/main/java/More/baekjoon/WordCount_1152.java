package More.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordCount_1152 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] strs = str.split(" ");
    int length = strs.length;

    for (int i =0; i< strs.length; i++){
      System.out.println("["+i+"]"+strs[i]);
      if (strs[i].equals("")) length--;
    }
    // 왜 if (strs[i].equals(" ")) length--;로 하면 안될까?
    // " " 으로 split했기 때문에 배열에는 아무것도 들어가지 않는다.

    System.out.println(length);
  }
}
