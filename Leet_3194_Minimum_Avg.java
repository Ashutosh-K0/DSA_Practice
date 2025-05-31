import java.util.Arrays;

class Leet_3194_Minimum_Avg {
    /**
     * This method calculates the minimum average of pairs formed by sorting the input array.
     * It sorts the array and then pairs the smallest and largest elements, moving towards the center.
     * The average of each pair is calculated, and the minimum average is returned.
     *
     * @param nums an array of integers
     * @return the minimum average of pairs formed from the sorted array
     */
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double res = Double.MAX_VALUE;
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            res = Math.min(res, avg);
            left++;
            right--;
        }
        return res;
    }
}