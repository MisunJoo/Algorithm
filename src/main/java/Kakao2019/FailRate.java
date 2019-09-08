package Kakao2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//[3,4,2,1,5]
public class FailRate {

    public static void main(String[] args) throws Exception {
        int N = 5;
        int[] stages = {2, 1, 2, 4, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        int currentP;// 현재 스테이지에 머물러 있는 사람
        int triedP; // 현재 스테이지를 시도한 사람( 머물러 + 지나간 사람 포함)

        Arrays.sort(stages); // 1, 2, 2, 2, 3, ,3 ,4 ,6

        // N 수만큼 각각 stage의 실패율 구하기
        for (int current = 1; current <= N; current++) {
            currentP = 0;
            triedP = 0;
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] >= current) {
                    triedP++;
                }
                if (stages[i] == current) {
                    currentP++;
                }
            }

            if (triedP == 0) {
                map.put(current, 0.0);
            } else {
                map.put(current, currentP / (double) triedP);
            }
        }

        System.out.println(map);

        // 정렬
        List<Integer> answerArr = sortByValue(map);
        for (int i = 0; i < answerArr.size(); i++) {
            answer[i] = answerArr.get(i);
        }

        return answer;
    }

    public static List sortByValue(final Map map) {

        List<String> list = new ArrayList();
        list.addAll(map.keySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                return ((Comparable) v2).compareTo(v1);
            }
        });
//        Collections.reverse(list); // 주석시 오름차순
        return list;

    }
}
