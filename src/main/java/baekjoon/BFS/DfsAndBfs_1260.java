package baekjoon.BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsAndBfs_1260 {

    static ArrayList<Integer>[] a;
    static boolean[] c;

    // dfs에서 재귀로 된다는 것은 그 순간 방문 하는 것 !
    public static void dfs(int x) {
        if (c[x] == true) {
            return;
        }
        c[x] = true;
        System.out.print(x + " ");
        for (int y : a[x]) {
            if (c[y] == false) {
                dfs(y);
            }
        }
    }


    // q에 넣는다는 것은 "방문할 것"이기 때문에, 넣는 순간 visited 된다
    // 그래서 q에 넣는 것이다. 넣는 순간 그와 그 자식들에 대해 탐색하기 위해서
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();

        // 초기작업
        q.add(start);
        c[start] = true;

        // q에 들어온 자식들을 너비우선으로 탐색
        while (!q.isEmpty()) {
            int x = q.remove();
            System.out.print(x + " ");
            for (int y : a[x]) {
                if (c[y] == false) {
                    c[y] = true;
                    q.add(y);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        a = (ArrayList<Integer>[]) new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v);
            a[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(a[i]);
        }

        c = new boolean[n + 1];
        dfs(start);
        System.out.println();

        c = new boolean[n+1];
        bfs(start);
        System.out.println();
    }
}
