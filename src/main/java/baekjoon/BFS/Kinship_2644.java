package baekjoon.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/*
* https://blog.naver.com/PostView.nhn?blogId=metalingus58&logNo=221286236300&redirect=Dlog&widgetTypeCall=true&directAccess=false
*
* 재귀 잘 못쓰면 쓰지 말자
* 못한 생각 : 시작점에서 각각의 정점으로 갈 수 있는 거리를 배열로 저장하면 쉽다
* */

public class Kinship_2644 {

    static int n;
    static int m;
    static int from;
    static int to;
    static ArrayList<Integer>[] a;
    static int[] visited, dep;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        visited = new int[n + 1];
        dep = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        from = Integer.parseInt(st.nextToken());
        to = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        a = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            a[x].add(y);
            a[y].add(x);
        }

        bfs(from);

        if (dep[to] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dep[to]);
        }
    }

    public static void bfs(int from) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(from);
        dep[from] = 0;

        while (!q.isEmpty()) {
            int p = q.poll();

            if (visited[p] == 0) {
                visited[p] = 1;

                for (int t : a[p]) {
                    if (visited[t] == 0) {
                        dep[t] = dep[p] + 1;
                    }
                    q.add(t);
                }
            }
        }

    }

}
