package list;

public class SLinkedList {
  // 인스턴스 변수
  private Node head;
  private Node tail;
  private int size;

  // 생성자
  public SLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  // 탐색, 추가, 삭제 연산 메서드
  public void addFirst(Node newNode) {
    if (size == 0) {
      tail = newNode;
    }
    newNode.setNext(head);
    head = newNode;
    size++;
  }

  public void addLast(Node newNode) {
    if (size == 0) {
      addFirst(newNode);
    } else {
      tail.setNext(newNode);
      tail = newNode;
      size++;
    }
  }

  public void add(int index, Node newNode) {
    if (index == 0) {
      addFirst(newNode);
    } else {
      Node prevNode = getNode(index - 1);
      newNode.setNext(prevNode.getNext());
      prevNode.setNext(newNode);
      size++;
    }
    if (newNode.getNext() == null) {
      tail = newNode;
    }
  }

  public Node getTail() {
    Node temp = head;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    return temp;
  }

  public Node getNode(int index) {
    Node x = head;
    for (int i = 0; i < index; i++) {
      x = x.getNext();
    }
    return x;
  }

  public int size() {
    return size;
  }

  public Object removeFirst() {
    Object removedData = head.getItem();
    Node temp = head;
    head = temp.getNext();
    temp.setNext(null);
    size--;
    return removedData;
  }

  public int indexOf(Object item) {
    Node temp = head;
    int index = 0;
    for (int i = 0; i < size; i++) {
      if (temp.getItem().equals(item)) {
        index = i;
        return index;
      }
      temp = temp.getNext();
    }
    return -1;
  }

  @Override
  public String toString() {
    String res = "";
    Node temp = head;
    while (temp != null) {
      res += temp.getItem();
      if (temp.getNext() != null) {
        res += ", ";
      }
      temp = temp.getNext();
    }
    return "[" + res + "]";
  }
}
