package stackNQueue;

import java.util.NoSuchElementException;

public class ListQueue<E> {
  private Node<E> front;
  private Node<E> rear;
  private int size;

  public ListQueue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  // size, isEmpty, peek
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E peek() {
    if (isEmpty()) {
      return null;
    }
    return front.getItem();
  }

  // add ==> addLast (h, t)
  public boolean add(E newItem) {
    Node<E> newNode = new Node<>(newItem);

    if (rear == null) {
      this.front = newNode;
//      this.rear = newNode;
    } else {
      this.rear.setNext(newNode);
//      this.rear = newNode;
    }
    this.rear = newNode;
    size++;

    return true;
  }

  // poll ==> removeFirst (h, t)
  public E poll() {
    E delItem = this.front.getItem();

    if (front == null) {
      throw new NoSuchElementException();
    }
    if (front.getNext() == null) {
      this.front = null;
      this.rear = null;
    } else {
      this.front = this.front.getNext();
    }
    size--;

    return delItem;
  }


  @Override
  public String toString() {
    String res = "";
    Node temp = front;
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
