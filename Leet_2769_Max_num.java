class Leet_2769_Max_num {
    /**
     * Given an integer num and an integer t, return the maximum achievable value of x.
     * The maximum achievable value of x is defined as the largest integer such that
     * |x - num| <= t.
     *
     * @param num the base number
     * @param t   the tolerance
     * @return the maximum achievable value of x
     */
    public int theMaximumAchievableX(int num, int t) {
        return num + 2*t;
    }
}