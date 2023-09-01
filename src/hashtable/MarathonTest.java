package hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MarathonTest {
  public static void main(String[] args) {
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};
    marathon(participant, completion);
  }

  static void marathon(String[] participant, String[] completion) {
    Map<String, Integer> map = new Hashtable<>();
    int defaultValue = 0;

    for (String person : participant) {
      map.put(person, map.getOrDefault(person, defaultValue) + 1);
    }
//    System.out.println(map);

    for (String person : completion) {
      map.put(person, map.get(person) - 1);
    }
//    System.out.println(map);

    Set<String> keys = map.keySet();
    String res = "";
    for (String key : keys) {
      if (map.get(key) != 0) {
        res += key;
      }
    }
    System.out.println(res);;
  }
}
