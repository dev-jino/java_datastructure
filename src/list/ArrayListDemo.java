package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println(numbers);

    numbers.remove(3);
    System.out.println(numbers);

    System.out.println(numbers.get(2));

    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(100);
    ll.add(200);
    ll.add(300);
    ll.add(400);

    System.out.println(ll);
    ll.remove(2);
    System.out.println(ll);
  }
}
