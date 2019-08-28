package Kakao2019;

import java.util.ArrayList;
import java.util.List;

/*
* 오답. 다시풀어보자
* */
public class Muckbang {

    public static void main(String[] args) throws Exception {
        int[] food_times = {3, 1, 2};
        long k = 5;

        System.out.println(solution(food_times, k));
    }

    public static int solution(int[] food_times, long k) {
        int answer = 0;
        int pointer = -1;

        List<Integer> list = new ArrayList<Integer>();
        for (int i : food_times) {
            list.add(i);
        }

        for (int i = 0; i < k; i++) {

            // 포인터 이동
            if (pointer == list.size() - 1) {
                pointer = 0;
            } else {
                pointer++;
            }

            // 조건
            if (list.get(pointer) == 0) {// 다 먹은 음식이라면 포인터를 다음으로 맞춰줌
                do {
                    pointer++;
                }
                while (list.get(pointer) == 0);
            }

            // 음식을 먹음
            list.set(pointer, list.get(pointer) - 1);

        }

        // 0 세기
        int zeroCount = 0;

        for (int i : list) {
            if (i == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == food_times.length) {
            return -1;
        }


        if (list.get(pointer) == 0) {// 다 먹은 음식이라면 포인터를 다음으로 맞춰줌
            do {
                if (pointer == list.size() - 1) {
                    pointer = 0;
                } else {
                    pointer++;
                }
            }
            while (list.get(pointer) == 0);
        }


        return pointer;
    }

}
