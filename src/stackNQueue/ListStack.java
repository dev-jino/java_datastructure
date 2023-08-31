package stackNQueue;

import java.util.EmptyStackException;

public class ListStack<E> {
  private Node<E> top;
  private int size;

  public ListStack() {
    this.top = null;
    this.size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  // push(), pop(), peek()

  public E peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return top.getItem();
  }

  public E push(E newItem) {
    Node<E> newNode = new Node<>(newItem);
    newNode.setNext(top);
    top = newNode;
    size++;
    return newNode.getItem();
  }

  public E pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    E topItem = top.getItem();
    top = top.getNext();
    size--;
    return topItem;
  }

}
