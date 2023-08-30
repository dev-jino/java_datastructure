package list;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(10);
    sl.addFirst(node);
    System.out.println(sl.size());

  }
}
