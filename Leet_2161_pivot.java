class Leet_2161_pivot {
// LeetCode 2161 - Pivot Array
// Given an array of integers nums and an integer pivot, this class provides a method to rearrange the array
// such that all elements less than pivot come first, followed by elements equal to pivot, and then elements greater than pivot.
// The order of elements in each group should be preserved.
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : less) {
            result[index++] = num;
        }
        for (int num : equal) {
            result[index++] = num;
        }
        for (int num : greater) {
            result[index++] = num;
        }
        return result;
    }
}