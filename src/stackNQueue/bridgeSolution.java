package stackNQueue;

import java.util.LinkedList;
import java.util.Queue;

public class bridgeSolution {
  public static void main(String[] args) {
    int bridge_length = 2;
    int weight = 10;
    int[] cars = {7, 4, 5, 6};

    int time = 0;
    int weightSum = 0;
    Queue<Integer> q = new LinkedList<>();

    for (int car : cars) {
      while (true) {
        if (q.isEmpty()) {
          q.add(car);
          weightSum += car;
          time++;
          break;
        } else if (q.size() == bridge_length) {
          weightSum -= q.poll();
        } else {
          if (weightSum + car > weight) {
            q.add(0);
            time++;
            break;
          } else {
            q.add(car);
            weightSum += car;
            time++;
            break;
          }
        }
      }
    }

    System.out.println(time);
  }
}
