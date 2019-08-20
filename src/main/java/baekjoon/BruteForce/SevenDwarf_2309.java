package baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SevenDwarf_2309 {

    static List<Integer> dwarfs;
    static int totalCount = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dwarfs = new ArrayList<Integer>();

        for (int i = 0; i < 9; i++) {
            int input = Integer.parseInt(br.readLine());
            dwarfs.add(input);
            totalCount += input;
        }

        Collections.sort(dwarfs);
        solve();

        for (int i : dwarfs){
            System.out.println(i);
        }
    }

    public static void solve() {
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalCount - (dwarfs.get(i) + dwarfs.get(j)) == 100) {
                    dwarfs.remove(j);
                    dwarfs.remove(i);
                    return;
                }
            }
        }
    }
}
