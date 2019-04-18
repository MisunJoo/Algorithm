package leetcode;

public class validParentheses {
  public static void main(String[] args) {
    String a = "()"; //true
    String b = "()[]{}"; //true
    String c = "(]"; //false
    String d = "([)]"; //false
    String e = "{[]}"; //true
  }

  public boolean isValid(String s) {
    return true;
  }

}
