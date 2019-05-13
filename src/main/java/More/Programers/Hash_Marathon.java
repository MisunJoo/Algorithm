package More.Programers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Marathon {

  public static void main(String[] args) throws Exception{
//    Map<String, String> phonebook = new HashMap<String, String>();
//    phonebook.put("Hyeja", "1111");
//    phonebook.get("Hyeja");
//    Set<String> keys = phonebook.keySet();
//    Set<Map.Entry<String, String>> value = phonebook.entrySet();
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));



    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String partInput = br.readLine().replaceAll(" ", "").trim();
    String[] participant = partInput.split(",");

    String compInput = br.readLine().replaceAll(" ", "").trim();
    String[] completion = compInput.split(",");

    String answer = solution(participant, completion);
    System.out.println(answer);
  }


    public static String solution(String[] participant, String[] completion) {
      String answer = "";

      Map<String, Integer> Codes = new HashMap<String, Integer>();
      for (String partName : participant){
        if (Codes.get(partName) == null) {
          Codes.put(partName, 1);
        } else {
          Codes.put(partName, Codes.get(partName) + 1);
        }
      }

      for (String compName : completion){
        if (Codes.get(compName) != null){
          Codes.put(compName, Codes.get(compName) - 1);
        }
      }

      Set<String> keys = Codes.keySet();
      for (String key : keys){
        if(Codes.get(key) != 0){
          answer = key;
        }
      }
      return answer;
    }


}
