package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WorkOut_3431 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int problemNumber = 1;

        while (testCase != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            if (L <= X && X <= U) {
                System.out.println("#" + problemNumber + " " + 0);
            } else if (X < L) {
                System.out.println("#" + problemNumber + " " + (L - X));
            } else if (X > U) {
                System.out.println("#" + problemNumber + " " + -1);
            }

            testCase--;
            problemNumber++;
        }
    }

}
