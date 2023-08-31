package stackNQueue;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    System.out.println("===Stack===");
    s.push(10);
    s.push(20);
    s.push(30);
    while (!s.isEmpty()) {
      System.out.println(s.pop() + " 이 삭제됨");
    }

    ListStack<String> ls = new ListStack<>();
    System.out.println("===ListStack===");
    System.out.println(ls.push("A"));
    System.out.println(ls.push("B"));
    System.out.println(ls.push("C"));
    while (!ls.isEmpty()) {
      System.out.println(ls.pop() + " 가 삭제됨");
    }
    System.out.println(ls.peek());

  }
}
