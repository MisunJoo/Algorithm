package More.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Stack_10828 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i <count; i++){
      br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();

        if (s.equals("top")){
          if (!list.isEmpty()) {
            System.out.println(list.get(list.size() - 1));
          } else {
            System.out.println("-1");
          }
        } else if (s.equals("size")){
          System.out.println(list.size());
        } else if (s.equals("empty")){
          if (!list.isEmpty()){
            System.out.println("0");
          } else {
            System.out.println("1");
          }

        } else if (s.equals("pop")){
          if (!list.isEmpty()) {
            System.out.println(list.get(list.size() - 1));
            list.remove(list.size() - 1);
          } else {
            System.out.println("-1");
          }
        } else {
          String[] words = s.split(" ");
          list.add(Integer.parseInt(words[1]));
        }



    }
  }
}


//  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//  String s = br.readLine();
//  int i = Integer.parseInt(br.readLine());
