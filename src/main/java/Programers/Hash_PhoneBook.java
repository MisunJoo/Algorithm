package More.Programers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_PhoneBook {
  public static void main(String[] args) throws Exception{
    //Map<String, String> phonebook = new HashMap<String, String>();
//    phonebook.put("Hyeja", "1111");
//    phonebook.get("Hyeja");
//    Set<String> keys = phonebook.keySet();
//    Set<Map.Entry<String, String>> value = phonebook.entrySet();
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inputString = br.readLine().replaceAll(" ", "");
    String[] phone_book = inputString.split(",");

    boolean answer = solution(phone_book);
    System.out.println(answer);

  }

  public static boolean solution(String[] phone_book) {
    boolean answer = true;
    int[] codes = new int[phone_book.length];
    Arrays.sort(phone_book);

    Map<String, Integer> Codes = new HashMap<String, Integer>();

    for (int i = 0; i < phone_book.length;  i++){
      Codes.put(phone_book[i], phone_book[i].hashCode());
      codes[i] = phone_book[i].hashCode();
    }

    Set<String> keys = Codes.keySet();
    for (String key : keys) {
      for (int i = 0; i < phone_book.length; i++) {
        if (key.equals(phone_book[i]))
          continue;

        if (phone_book[i].length() > key.length()) {
          if (key.equals(phone_book[i].substring(0, key.length()))) {
            answer = false;
          }
         }
       }
      }
    return answer;
    }
}
//.sort()를 써도 되나???
