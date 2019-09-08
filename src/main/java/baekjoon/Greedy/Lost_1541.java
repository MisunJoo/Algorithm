package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Lost_1541 {

    public static void main(String[] args) throws Exception {
        int sum = 0;
        int numSum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> a = new LinkedList<Integer>();
        Queue<Character> c = new LinkedList<Character>();
        for (char ch : br.readLine().toCharArray()) {
            if (ch == '+' || ch == '-') {
                c.add(ch);
            } else {
                a.add(ch - '0');
            }
        }

        sum += a.poll();
        System.out.println(a);

        for (int i = 0; i < a.size(); i++) {
            if (c.peek() == '+') {
                sum += a.poll();
            } else {
                break;
            }
        }

        for (int i = 0; i < a.size(); i++) {
            while (!a.isEmpty()) {
                numSum += a.poll() * -1;
            }
        }

        sum += numSum;

        System.out.println(sum);

    }

}
