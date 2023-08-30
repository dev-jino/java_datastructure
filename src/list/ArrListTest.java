package list;

import java.util.ArrayList;

public class ArrListTest {
  public static void main(String[] args) {
    ArrList<Integer> list = new ArrList<>();
    System.out.println(list.size());
    list.add(10);
    System.out.println(list.get(0));
    list.add(20);
    System.out.println(list.get(1));
    list.add(30);
    System.out.println(list.get(2));
    list.add(40);
    System.out.println(list.get(3));
    System.out.println(list.remove(1) + "가 삭제됨");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    System.out.println(list.size());
    System.out.println("---------------------------------------");
    list.add(2, 33);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

    System.out.println();

    System.out.println(list.size());

    System.out.println("--------------------------------------------------");

    ArrayList<Integer> aList = new ArrayList<>();
    System.out.println(aList.size());
    aList.add(10);
    System.out.println(aList.get(0));
    aList.add(20);
    System.out.println(aList.get(1));
    aList.remove(1);
    System.out.println(aList.size());
  }
}
