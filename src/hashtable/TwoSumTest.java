package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {
  public static void main(String[] args) {
    int[] given_nums = {10, 2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(twoSum1(given_nums, target)));
    System.out.println(Arrays.toString(twoSum2(given_nums, target)));
  }

  static int[] twoSum1(int[] nums, int target) {
    Map<Integer, Integer> numsMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      numsMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      // 자기 자신을 제외하고 더해서 target이 되는
      if (numsMap.containsKey(complement) && numsMap.get(complement) != i) {
        return new int[] {i, numsMap.get(complement)};
      }
    }
    return null;
  }

  static int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> numsMap = new HashMap<>();
    int diff = 0;

    for (int i = 0; i < nums.length; i++) {
      diff = target = nums[i];
      if (numsMap.containsKey(diff)) {
        return new int[] {i, numsMap.get(diff)};
      }
      numsMap.put(nums[i], i);
    }
    return null;
  }
}
