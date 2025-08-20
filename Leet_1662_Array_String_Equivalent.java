class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        return str1.equals(str2);
    }
}
// This code defines a class Solution with a method arrayStringsAreEqual that checks if two arrays of strings are equivalent.
// It concatenates the strings in each array and compares the resulting strings for equality. If they are equal, it returns true; otherwise, it returns false.
// The method uses String.join to concatenate the strings in each array efficiently.
// The time complexity is O(n + m), where n and m are the total lengths of the strings in word1 and word2, respectively.
// The space complexity is O(n + m) for storing the concatenated strings.