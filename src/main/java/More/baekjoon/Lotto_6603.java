package More.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto_6603 {
    public static void main(String[] args) {
        int setSize;
        StringBuffer pattern = new StringBuffer();

        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("로또의 길이를 입력하시오 : ");
            setSize = Integer.parseInt(br.readLine());
               List<StringBuffer> list = new ArrayList<StringBuffer>();
               List<StringBuffer> resultList = new ArrayList<StringBuffer>();

                for (int i = 0; i < setSize; i++) {
                    System.out.println("로또에 넣을 숫자를 입력하시오  : ");
                 //   list.add(br.readLine());
                }

                /* 앞부분 */
            for(int i = 0 ; i < 6; i++) {
                //패턴을 초기화
                pattern.append(list.get(i));

            }

            for(int h = 0; h < setSize ;h++){
                resultList.add(pattern);
                pattern.deleteCharAt(pattern.length() - h);
            }



            /* 뒷부분 */
            for(int j = list.size(); ;j--){

            }


            resultList.add(pattern);










            } catch (Exception ex){ex.printStackTrace();}


    }


}
