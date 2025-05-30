class Leet_2108_First_Palindrome {
// LeetCode 2108 - First Palindrome 
// Given an array of strings words, return the first palindromic string in the array.
// If there is no palindromic string, return an empty string "".
// A string is palindromic if it reads the same forward and backward.
    public boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}
// Time Complexity: O(n * m), where n is the number of words and m is the average length of the words.
// Space Complexity: O(1), since we are using a constant amount of space for the variables.