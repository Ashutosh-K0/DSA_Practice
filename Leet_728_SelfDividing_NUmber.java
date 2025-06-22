class Leet_728_SelfDividing_NUmber {
    public boolean self(int n) {
        int x = n;
        while (x > 0) {
            int digit = x % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> Lis = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (self(i)) {
                Lis.add(i);
            }
        }
        return Lis;
    }
}
