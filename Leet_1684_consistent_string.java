import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        int count = 0;

        for (char ch : allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        for (String word : words) {
            boolean isConsistent = true;
            for (char ch : word.toCharArray()) {
                if (!allowedSet.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}
