class Leet_560_SubArray_Sum {
    // Brute Force Approach
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+= nums[j];
                if(sum==k){
                count++;
            }
            }
            
        }
        return count;
    }
}
// Optimized Approach using HashMap
import java.util.HashMap;
class Leet_560_SubArray_Sum_Optimized {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // To handle the case when the subarray starts from index 0
        int count = 0, sum = 0;

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
