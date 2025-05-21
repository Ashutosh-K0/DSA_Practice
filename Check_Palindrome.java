class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int test = x;
        int rem = 0;
        while(test>0){
            rem = test%10;
            reverse = reverse*10 + rem;
            test=test/10;
        }
        if(reverse!=x){
            return false;
        }
        return true;
    }
}