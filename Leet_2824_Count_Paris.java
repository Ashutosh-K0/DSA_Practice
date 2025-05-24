class Leet_2824_Count_Paris {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int N = nums.size();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
