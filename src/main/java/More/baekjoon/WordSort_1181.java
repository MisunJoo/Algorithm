package More.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordSort_1181 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inputNumber = Integer.parseInt(br.readLine());
    String[] strs = new String[inputNumber];
    String compare;

    for (int i = 0; i < inputNumber; i++){
      strs[i] = br.readLine();
    }

    for (int i = 0; i < inputNumber; i++){
      compare = strs[i];
      for (int j = i + 1; j < inputNumber; j++) {
        if (compare.length() > strs[j].length()) {
          compare = strs[j];
          strs[j] = strs[i];
          strs[i] = compare;
        }
      }
    }

    System.out.println(strs.length);

    for (int i = 0; i < strs.length; i++) {
      System.out.println(strs[i]);
    }

  }
}
