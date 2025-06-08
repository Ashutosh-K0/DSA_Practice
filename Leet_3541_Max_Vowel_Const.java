class Leet_3541_Max_Vowel_Const {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        String vowels = "aeiou";
        int maxVowel = 0;
        int maxConsonant = 0;

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            if (freq[i] > 0) {
                if (vowels.indexOf(ch) != -1) {
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}
// LeetCode Problem 3541: Max Vowel and Consonant Frequency Sum
// This code defines a method to calculate the maximum frequency of vowels and consonants in a given string.
// It counts the occurrences of each character, identifies the maximum frequency of vowels and consonants,
// and returns their sum. The method uses a simple frequency array to track character counts and checks
// against a string of vowels to determine if a character is a vowel or consonant.
// The time complexity is O(n) where n is the length of the string, and space complexity is O(1) since the frequency array has a fixed size of 26.
