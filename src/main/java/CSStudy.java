import java.util.ArrayList;

public class CSStudy {

  public static void main(String[] args) {
    /* 만약 장소를 고르고 싶다면, 배열에 장소를 넣는다. */

    String[] member = {"미림", "미선", "윤희", "로희", "성민", "한영", "소연", "이수", "애리"};
    ArrayList<String> members = new ArrayList<String>();

    for(int i=0; i<member.length; i++){
      members.add(member[i]);
    }

    double random = Math.random();
    int ran = (int)(random * members.size()) -1;
    String presenter = members.get(ran);
    System.out.println(presenter);
  }
}
