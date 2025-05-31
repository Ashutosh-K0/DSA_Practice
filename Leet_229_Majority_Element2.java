import java.util.*;

class Leet_229_Majority_Element2 {
    /**
     * Finds all elements that appear more than n/3 times in the given array.
     * 
     * @param nums the input array of integers
     * @return a list of integers that are the majority elements
     */
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
// Time Complexity: O(n), where n is the length of the input array.
// Space Complexity: O(n), for storing the frequency map.
// This solution uses a HashMap to count the frequency of each element in the array.
// It then checks which elements have a frequency greater than n/3 and adds them to the result list.
// This approach is efficient and straightforward, leveraging the properties of HashMap for counting occurrences.