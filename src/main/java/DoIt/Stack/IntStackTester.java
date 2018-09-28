package DoIt.Stack;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true){
            System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
            System.out.println("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 클리어 (7) 비었는가 (8) 꽉찼는가 (0)종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: //푸시
                    System.out.println("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;


                case 2: //팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3: //피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4: //덤프
                    s.dump();
                    break;

                case 5: //검색
                    System.out.println("찾을 데이터 : ");
                    x = stdIn.nextInt();
                    int result = s.indexOf(x);

                    if (result == -1) System.out.println("찾는 데이터가 없습니다.");
                    else System.out.println("찾는 데이터는 " + result + "번 째 방에 있습니다.");

                    break;

                case 6: //클리어
                    s.clear();
                    System.out.println("모든 데이터를 삭제했습니다.");
                    break;

                case 7: //비었는가?
                    if (s.isEmpty()) System.out.println("비었습니다.");
                    else System.out.println("데이터가 있습니다.");
                    break;

                case 8: //차있는가?
                    if (s.isFull()) System.out.println("가득 차있습니다.");
                    else System.out.println("데이터가 가득차있지 않습니다.");
                    break;

            }// switch
        }
    }
}
