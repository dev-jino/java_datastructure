package list;

public class Node<E> {
  // 인스턴스 변수
  private E item;
  private Node<E> next;

  // 생성자
  public Node(E newItem) {
    this.item = newItem;
    this.next = null;
  }

  // 메서드
  public Object getItem() {
    return item;
  }

  public Node<E> getNext() {
    return next;
  }

  public void setItem(E newItem) {
    this.item = newItem;
  }

  public void setNext(Node<E> newNext) {
    this.next = newNext;
  }
}
