class Solution {
    public int trailingZeroes(int n) {
        int num = n;
        int count = 0;
       while(num>=5){
        num = num/5;
        count += num;
       }
       return count; 
    }
}