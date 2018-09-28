package DoIt.Recursive;

import java.util.Scanner;

public class Exercise_2 {

    static int gcd(int x, int y){
        int i = (x < y) ? x : y;

        while(true){
            if (((x % i) == 0) && ((y % i) == 0))
                break;
            i--;
        }

        return i;
    }


    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.println("정수를 입력하세요. :"); int x = stdIn.nextInt();
        System.out.println("정수를 입력하세요. :"); int y = stdIn.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");

    }
}
