package DoIt.Recursive;

import java.util.Scanner;

public class Exercise_1 {

    private static int factorial(int x){
        int result = 1;

        for(int i=x; i>0; i--){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

        System.out.println(x +"의 팩토리얼은 "+factorial(x));
    }
}
