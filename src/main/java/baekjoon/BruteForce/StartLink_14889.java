package baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
/*
* 드디어 백트래킹이 조금 이해가 갔다. (짝짝짝)
* */

/* 중요코드!!!!! 조합뽑는 쌍을 효율적으로 작성한 코드
* for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                result += map[array[i]][array[j]];
                result += map[array[j]][array[i]];
            }
        }
* */

public class StartLink_14889 {
    static int N;
    static int[][] map;
    static Stack<Integer> start = new Stack<Integer>();
    static boolean[] visited;
    static boolean[] check;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        visited = new boolean[N];
        check = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(answer);
    }

    // N/2 개를 선택
    public static void dfs(int v, int len) {
        if (len == N / 2) {
            visited = new boolean[N];
            divide();
            return;
        }

        for (int i = v; i < N; i++) {
            if (!start.contains(i)) {
                start.add(i);
                dfs(i, len + 1);
                start.pop();
            }
        }
    }
    // start그룹과 link그룹으로 나눔
    public static void divide() {
        int[] a = new int[N / 2];
        int[] b = new int[N / 2];
        for (int i = 0; i < N / 2; i++) {
            a[i] = start.get(i);
            visited[start.get(i)] = true;
        }

        int bi = 0;
        for (int i = 0; i < N; i++) {
            if (visited[i] == false) {
                b[bi++] = i;
            }
        }

        int aCalc = calc(a);
        int bCalc = calc(b);
        int diff = Math.abs(aCalc - bCalc);

        if (answer > diff) {
            answer = diff;
        }
    }
    //a, b 각각에서 2개씩 뽑아 그 각각 합을 구함
    public static int calc(int[] array) {
        int result = 0;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                result += map[array[i]][array[j]];
                result += map[array[j]][array[i]];
            }
        }
        return result;
    }
}
