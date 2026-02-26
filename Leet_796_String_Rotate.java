class Solution {
    public boolean rotateString(String s, String goal) {
        String S = s + s;
        if(s.length() != goal.length()){
            return false;
        }
        return (s + s).contains(goal);
    }
}