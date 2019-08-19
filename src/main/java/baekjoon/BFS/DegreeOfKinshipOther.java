package More.baekjoon.BFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DegreeOfKinshipOther {
  static int n;
  static int x;
  static int y;
  static int m;
  static int p1;
  static int p2;
  static int count = -1;
  static List<Integer> xArr = new ArrayList<Integer>();
  static List<Integer> yArr = new ArrayList<Integer>();

  static Map<Integer, Integer> kinship = new HashMap<Integer, Integer>(); //본인, 부모

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    x = sc.nextInt();
    y = sc.nextInt();
    m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      p1 = sc.nextInt();
      p2 = sc.nextInt();
      kinship.put(p2, p1);
    }

    xArr.add(x);
    yArr.add(y);

    for (int i = 1; i <= m; i++) {
      Integer parent = kinship.get(x);
      if (parent == null) break;
      else {
        xArr.add(parent);
        x = parent;
      }
    }

    for (int i = 1; i <= m; i++) {
      Integer parent = kinship.get(y);
      if (parent == null) break;
      else {
        yArr.add(parent);
        y = parent;
      }
    }

    for (int i = 0; i < xArr.size(); i++) {
      for (int j = 0; j <yArr.size(); j++) {
        if (xArr.get(i).equals(yArr.get(j))) {
          count = 0;
          count = i + j;
          break;
        }
      }
    }

    System.out.println(count);
  }
}
