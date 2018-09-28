package DoIt.Recursive;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        int result = 0;
        if(n>0)
            return result = (n * factorial(n-1));
        else
            return 1;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

       System.out.println(x +"의 팩토리얼은 "+factorial(x));
    }

}
