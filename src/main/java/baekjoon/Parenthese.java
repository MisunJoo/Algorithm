/*
package More.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Parenthese {
    public static void main(String[] args) {
        int result = 0;
        Stack<Character> stack = new Stack<Character>();

        Scanner stdIn = new Scanner(System.in);
        System.out.println("괄호 값을 입력하시오. : ");
        String userInput = stdIn.nextLine();


        char[] arr = userInput.toCharArray();
        List<Character> list = new ArrayList<Character>();



        if(list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i++) {
                switch (list.get(i)){
                    case '(' :
                        stack.push(list.get(i));
                        break;
                    case '[' :
                        stack.push(list.get(i));
                        break;
                    case ')' :
                        if(stack.peek().equals('(')){
                            stack.pop();
                            stack.push('2');
                        }
                        break;
                    case ']':
                        if(stack.peek().equals('[')){
                            stack.pop();
                            stack.push('3');
                        }
                        break;
                }//switch
            }//for

            for (int i = 0; i < list.size(); i++){
                stack.
            }

        }

        System.out.println(userInput);
        System.out.println("계산 값은 : " + result + "입니다.");
    }

    public int stackCheck(Stack<Character> stack, char input){
        List<Character> stackList = new ArrayList<Character>();
        while(!stack.isEmpty()){
            //stackList = stack.pop();
        }

        if (input == ')'){

        }else if(input == ']'){

        }
    }


}
*/
