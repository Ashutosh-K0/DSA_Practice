class Leet_3289_Two_Sneaky {
    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[101];
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 0; i < count.length && index < 2; i++) {
            if (count[i] == 2) {
                result[index++] = i;
            }
        }
        return result;
    }
}