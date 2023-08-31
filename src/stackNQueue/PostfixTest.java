package stackNQueue;

public class PostfixTest {
  public static void main(String[] args) {
    String[] strs = {"8", "3", "2", "+", "1", "-", "/"};
    ListStack<String> stack = new ListStack<>();
    int res = 0;
    int temp = 0;

    for (String str : strs) {
      if (!isOp(str)) {
        stack.push(str);
      } else if (isOp(str)) {
        temp = Integer.parseInt(stack.pop());
        res = calc(Integer.parseInt(stack.pop()), temp, str);
        stack.push(String.valueOf(res));
//        stack.push(res + "");
      }
    }
    if (!stack.isEmpty()) {
      System.out.println("계산 결과는 " + stack.pop() + " 입니다.");
    }
  }

  static boolean isOp(String str) {
    if (str.equals("+") || str.equals("-")
    || str.equals("*") || str.equals("/")) {
      return true;
    }
    return false;
  }

  static int calc(int a, int b, String op) {
    int res = 0;

//    if (op.equals("+")) {
//      res = a + b;
//    } else if (op.equals("-")) {
//      res = a - b;
//    } else if (op.equals("*")) {
//      res = a * b;
//    } else if (op.equals("/")) {
//      res = a / b;
//    }
    switch (op) {
      case "+" : res = a + b; break;
      case "-" : res = a - b; break;
      case "*" : res = a * b; break;
      case "/" : res = a / b; break;
    }
    return res;
  }
}
