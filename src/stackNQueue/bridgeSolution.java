package stackNQueue;

import java.util.LinkedList;
import java.util.Queue;

public class bridgeSolution {
  public static void main(String[] args) {
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7, 4, 5, 6};

    int time = 0;
    int weightSum = 0;
    Queue<Integer> q = new LinkedList<>();

    for (int truck_weight : truck_weights) {
      while (true) {
        System.out.println("truck_weight : " + truck_weight);
        System.out.println(q);
        if (q.isEmpty()) {
          q.add(truck_weight);
          weightSum += truck_weight;
          time++;
          break;
        } else if (q.size() == bridge_length) {
          int a = q.poll();
          if (a != 0) {
            time++;
          }
          weightSum -= a;
//          if (q.peek() != 0) {
//            time++;
//          }
//          weightSum -= q.poll();
        } else {
          if (weightSum + truck_weight > weight) {
            q.add(0);
            time++;
          } else {
            q.add(truck_weight);
            weightSum += truck_weight;
            time++;
            break;
          }
        }
      }
    }
    System.out.println(time);
  }
}
