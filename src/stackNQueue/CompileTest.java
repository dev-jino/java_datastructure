package stackNQueue;

public class CompileTest {
  public static void main(String[] args) {
    ListStack<String> stack = new ListStack<>();
    String[] par = {"{", "(", ")", "{", "(", ")", ")", "}"};

    for (String p : par) {
      if(p.equals("{") || p.equals("(")) {
        stack.push(p);
      } else {
        if (p.equals("}") && stack.pop().equals("{")) {
          System.out.println("{} 괄호가 정상적으로 닫힘");
        } else if (p.equals(")") && stack.pop().equals("(")) {
          System.out.println("() 괄호가 정상적으로 닫힘");
        } else {
          System.out.println("컴파일 오류입니다.");
          break;
        }
      }
    }

    if (!stack.isEmpty()) {
      System.out.println("컴파일 오류입니다.");
    }
  }
}
