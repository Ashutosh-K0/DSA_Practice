class Leet_3110_Score_String {
    /**
     * This method calculates the score of a string based on the absolute differences
     * between adjacent characters in the string.
     *
     * @param s The input string for which the score is to be calculated.
     * @return The total score as an integer.
     */
    public int scoreOfString(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return sum;
    }
}
// Time Complexity: O(n), where n is the length of the string
// Space Complexity: O(1), no extra space is used