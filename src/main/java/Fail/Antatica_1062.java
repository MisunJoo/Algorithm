package Fail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// 입출력 보기 : 너무 비효율적이다.
// 실패

public class Antatica_1062 {

    static int N;
    static int K;
    static List<String> inputs = new ArrayList<String>(); // 입력된 문자열 보관용 배열
    static List<Character> letter = new ArrayList<Character>(); // 사용된 문자 보관용 배열
    static List<Boolean[]> check = new ArrayList<Boolean[]>();
    static int count = 0;
    static int select = 0;
    static Queue<Character> que = new LinkedList<Character>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            inputs.add(str);
        }

        char[] ch = inputs.get(0).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!letter.contains(ch[i])) {
                letter.add(ch[i]);
            }
        }

        for (String str : inputs) {
            for (int i = 0; i < str.length(); i++) {
                if (!letter.contains(str.charAt(i))) {
                    letter.add(str.charAt(i));
                }
            }
        }

        for (int i = 0; i < inputs.size();i++){
            check.add(new Boolean[inputs.get(i).length()]);
        }

        // 6개 선택
        solve(letter.get(0));


    }

    public static void solve(char ch){
     if(que.size() < K) {
         que.offer(ch);


     }

    }

}
