import java.util.*;

class Leet_2465_DistinctAvg {
    /**
     * Given an array of integers nums, return the number of distinct averages of all pairs of elements in nums.
     * The average of a pair (nums[i], nums[j]) is defined as (nums[i] + nums[j]) / 2.
     * 
     * @param nums an array of integers
     * @return the number of distinct averages
     */
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        List<Double> distinct = new ArrayList<>();
        int start = 0, end = nums.length - 1;
        while (start < end) {
            double avg = (nums[start] + nums[end]) / 2.0;
            if (!distinct.contains(avg)) {
                distinct.add(avg);
            }
            start++;
            end--;
        }
        return distinct.size();
    }
}
