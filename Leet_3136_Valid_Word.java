class Solution {
    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else if (!Character.isDigit(ch)) {
                return false;
            }
        }
        if (hasVowel && hasConsonant) {
            return true;
        } else {
            return false;
        }
    }
}
// LeetCode Problem: Valid Word
// This code checks if a given word is valid based on the criteria that it must contain at
// least one vowel and one consonant, and must be at least 3 characters long.
// It also ensures that the word contains only letters and digits.
// The method isVowel checks if a character is a vowel, and the method isValid checks the
// validity of the word based on the defined rules. If the word meets all criteria, it returns true;
// otherwise, it returns false.
// The code is structured to handle both uppercase and lowercase letters for vowels.
// It also handles invalid characters by returning false if any character is not a letter or digit.
// The solution is efficient and straightforward, iterating through the word only once to check the conditions.
// The code is written in Java and can be used in a LeetCode environment for testing and submission.
// The solution is designed to be clear and maintainable, with separate methods for checking vowels
// and validating the word, making it easy to understand and modify if necessary.
// The code is ready for submission and can be tested with various inputs to ensure its correctness.
// The solution is efficient with a time complexity of O(n), where n is the length of the word,
// and a space complexity of O(1) since it uses a constant amount of extra space.
// The code is complete and adheres to the problem requirements.