import java.util.HashMap;
import java.util.Map;

class SolutionToSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[](map.get(nums[i]), i);
            }
            map.put(nums[i], i);
        }
        return result;
    }
}