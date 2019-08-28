package Kakao2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  입력에서 어떻게 출력이 될지 과정을 세워보자
 * */

public class OpenKatalk {

    public static void main(String[] args) throws Exception {
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};

        System.out.println(Arrays.toString(solution(record)));
    }

    public static String[] solution(String[] record) {
        String[] answer = {};
        List<String> answerArr = new ArrayList<String>();
        String[][] splited = new String[record.length][3];

        for (int i = 0; i < record.length; i++) {
            splited[i] = record[i].split(" ");
        }

        // 유저를 중복없이 저장
        Map<String, String> users = new HashMap<String, String>();
        for (int i = 0; i < splited.length; i++) {
            if (!users.containsKey(splited[i][1])) {
                users.put(splited[i][1], splited[i][2]);
            } else if (users.containsKey(splited[i][1]) && !splited[i][0].equals("Leave")) {
                users.put(splited[i][1], splited[i][2]);
            }
        }

        // 출력
        for (int i = 0; i < splited.length; i++) {
            if (splited[i][0].equals("Enter")) {
                answerArr.add(users.get(splited[i][1]) + "님이 들어왔습니다.");
            }
            if (splited[i][0].equals("Leave")) {
                answerArr.add(users.get(splited[i][1]) + "님이 나갔습니다.");
            }
        }

        answer = new String[answerArr.size()];

        return answerArr.toArray(answer);
    }
}

/*
 * ["Prodo님이 들어왔습니다.",
 * "Ryan님이 들어왔습니다.",
 * "Prodo님이 나갔습니다.", "
 * Prodo님이 들어왔습니다."]
 * */
