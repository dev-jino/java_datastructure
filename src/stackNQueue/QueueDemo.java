package stackNQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    System.out.println(q.peek());
    q.add(10);
    q.add(20);
    System.out.println(q.peek());
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q.poll());
    System.out.println(q);

    System.out.println("---------------");
    ListQueue<Integer> lq = new ListQueue<>();
    System.out.println(lq.peek());
    lq.add(10);
    lq.add(20);
    System.out.println(lq.peek());
    System.out.println(lq);
    System.out.println(lq.poll());
    System.out.println(lq.poll());
    System.out.println(lq);

  }
}
