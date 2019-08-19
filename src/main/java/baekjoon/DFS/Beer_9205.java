package More.baekjoon.DFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Beer_9205 {

  static int testCase;
  static int n; //편의점 개수
  static int distance;
  static int beer;
  static List<Point> pointArr = new ArrayList<Point>();

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    testCase = Integer.parseInt(br.readLine());
    n = Integer.parseInt(br.readLine());
    beer = 20;

    for (int i = 0; i < n + 2; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      pointArr.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
      beer = beer - solve(pointArr.get(i), i);
    }

    for (int i = 1; i < n + 2; i++) {
      if ( beer < 0 ) {
        System.out.println("sad");
        break;
      }
      if (solve(pointArr.get(i), i) ==  40000){
        System.out.println("sad");
        break;
      } else {
        beer = beer - solve(pointArr.get(i), i);
      }
    }


  }

  static int solve(Point point, int i) {
    if (pointArr.size() < 2) {
      return 0;
    }

    // 두 점사이의 거리 계산
    distance = Math.abs(pointArr.get(i).x - pointArr.get(i - 1).x)
        + Math.abs(pointArr.get(i).y - pointArr.get(i - 1).y);

    // 거리내에 맥주가 부족할 시에 sad break;
    if ( (distance / 50) > beer) return -40000;
    else {
      beer = 20;
      return beer;
    }
  }

}
