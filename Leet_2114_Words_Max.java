class Leet_2114_Words_Max {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = sentences[i].split(" ").length;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
// Time Complexity: O(n), where n is the total number of words in all sentences.
// Space Complexity: O(1), since we are using a constant amount of space for the max variable.