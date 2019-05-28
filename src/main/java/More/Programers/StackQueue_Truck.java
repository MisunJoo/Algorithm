//package More.Programers;
//
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class StackQueue_Truck {
//  public static void main(String[] args) {
//    int bridge_length = 2;
//    int weight = 10;
//    int[] truck_weight = {7, 4, 5, 6};
//
//    System.out.println(solution(bridge_length, weight, truck_weight));
//  }
//    public static int solution(int bridge_length, int weight, int[] truck_weights) {
//      int answer = 0;
//      int nowWeigth = 0;
//      Queue<Integer> q = new LinkedList<Integer>();
//
//      for (int i = 0; i < truck_weights.length; i++) {
//        q.offer(truck_weights[i]);
//      }
//
//      while ( ! q.isEmpty() ) {
//        nowWeigth = q.poll();
//
//
//        if ( nowWeigth < weight ){
//          nowWeigth += q.poll();
//        }
//
//      return answer;
//    }
//}
////8