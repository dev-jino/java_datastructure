package list;

import java.util.LinkedList;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(10);
//    sl.addFirst(node);
    sl.addLast(node);
    System.out.println(sl.size());
    Node<Integer> node1 = new Node<>(20);
    sl.addLast(node1);
    System.out.println(sl.size());
    Node<Integer> node2 = new Node<>(30);
    sl.addLast(node2);
    System.out.println(sl.size());
    Node<Integer> node3 = new Node<>(40);
    sl.add(1, node3);
    System.out.println(sl.size());

    System.out.println(sl.removeFirst());
    System.out.println(sl.size());

    System.out.println(sl);
    System.out.println("sl.indexOf(30) = " + sl.indexOf(30));
    System.out.println("sl.indexOf(20) = " + sl.indexOf(20));
    System.out.println("sl.indexOf(10) = " + sl.indexOf(10));

    System.out.println(sl);

    System.out.println("--------------------------------------");

    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.add(10);
    testLL.add(20);
    System.out.println(testLL);
    LinkedList<Integer> testLL2 = new LinkedList<>();
    testLL2.addLast(10);
    testLL2.addLast(20);
    System.out.println(testLL2);

  }
}
