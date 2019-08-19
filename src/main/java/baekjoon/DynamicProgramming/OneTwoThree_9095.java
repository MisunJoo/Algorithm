package baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneTwoThree_9095 {
    static int testCase;
    static int[] output;
    static int n;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());

        output = new int[11];
        output[1] = 1;
        output[2] = 2;
        output[3] = 4;

        for (int i = 0; i < testCase; i++){
            n = Integer.parseInt(br.readLine());
            for (int j = 4; j <=n; j++) {
               output[j] = output[j-1] + output[j-2] + output[j-3];
            }
            System.out.println(output[n]);
        }

    }
}
