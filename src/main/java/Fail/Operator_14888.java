package Fail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


/* 실패! 다시풀어야함 */
public class Operator_14888 {

    static int N;
    static int[] a = new int[12];
    static int plus;
    static int minus;
    static int multi;
    static int div;
    static List<Integer> result = new ArrayList<Integer>();
    static List<String> operator = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        plus = Integer.parseInt(st.nextToken());
        minus = Integer.parseInt(st.nextToken());
        multi = Integer.parseInt(st.nextToken());
        div = Integer.parseInt(st.nextToken());




        // 수열은 일정한 값을 제공
        // 그 아래에서 연산자들은 다중 for를 통해 값을 제공 => 바로 계산이 되나? => 미리 string값으로 저장만을 해놓아야하나?
        // 결과를 계산하며 result에 저장



    }
}
