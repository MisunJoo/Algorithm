package DoIt;

import java.util.Scanner;

public class Max3 {
    static int max4(int a, int b, int c, int d){
        int max = a;

        if(b > a) max = b;
        if (c > b) max = c;
        if (d > c) max = d;

        return max;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("a ="); a = stdIn.nextInt();
        System.out.println("b ="); b = stdIn.nextInt();
        System.out.println("c ="); c = stdIn.nextInt();
        System.out.println("d ="); d = stdIn.nextInt();



        System.out.println("max : " + max4(a, b, c, d));


    }
}
