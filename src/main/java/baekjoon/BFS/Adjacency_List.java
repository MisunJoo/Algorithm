package baekjoon.BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Adjacency_List {

    static int nV;
    static int nE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        nV = 3;
        nE = 3;

        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nV; i++) {
            l.add(new ArrayList<Integer>()); // 각각의 vertext의 리스트 초기화
        }

        l.get(0).add(1);   // 양방향 그래프이므로, vertex 1, 2 값 초기화
        l.get(0).add(2);
        l.get(1).add(3);

        System.out.println(l);

    }

}
