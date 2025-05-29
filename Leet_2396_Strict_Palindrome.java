class Leet_2396_Strict_Palindrome {
    public boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String convertToBase(int num, int base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % base);
            num /= base;
        }
        return sb.reverse().toString();
    }
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            String converted = convertToBase(n, base);
            if (!isPalindrome(converted)) {
                return false;
            }
        }
        return true;
    }
}
// Time Complexity: O(n^2) for the loop and palindrome check
// Space Complexity: O(n) for the string conversion
// Note: The problem is actually impossible for n > 4, so the function will always return false for n > 4.
// The function is provided for educational purposes to illustrate the conversion and palindrome checking process.
