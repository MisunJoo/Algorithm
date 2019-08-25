package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome_1215 {

    static int len;
    static char[][] a;
    static int count;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        for (int t = 1; t <= 10; t++) {

            len = Integer.parseInt(br.readLine());
            count = 0;
            a = new char[8][8];

            for (int i = 0; i < 8; i++) {
                a[i] = br.readLine().toCharArray();
            }

            // 가로 탐색
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8 - len + 1; j++) {
                    if (a[i][j] == a[i][j + len - 1]) {
                        compare(i, j);
                    }
                }
            }

            //세로 탐색
            for (int j = 0; j < 8; j++) {
                for (int i = 0; i < 8 - len + 1; i++) {
                    if (a[i][j] == a[i + len - 1][j]) {
                        compareHeight(i, j);
                    }

                }
            }

            System.out.println("#" + t + " " + count);
        }
    }

    public static void compare(int i, int j) {
        int miniCount = 0;
        for (int k = 0; k < len / 2 + 1; k++) {
            if (a[i][j + k] == a[i][j + len - 1 - k]) {
                miniCount++;
            } else {
                return;
            }

            if (miniCount == len / 2) {
                count++;
            }
        }
    }

    public static void compareHeight(int i, int j) {
        int miniCount = 0;
        for (int k = 0; k < len / 2 + 1; k++) {
            if (a[i + k][j] == a[i + len - 1 - k][j]) {
                miniCount++;
            } else {
                return;
            }

            if (miniCount == len / 2) {
                count++;
            }
        }
    }
}
