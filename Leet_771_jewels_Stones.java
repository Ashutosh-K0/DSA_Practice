import java.util.HashSet;
import java.util.Set;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        int count = 0;
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }

        return count;
    }
}
