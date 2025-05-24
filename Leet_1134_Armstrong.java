// LeetCode Problem 1134: Armstrong Number
class Leet_1134_Armstrong {
    public static void main(String[] args) {
        Leet_1134_Armstrong obj = new Leet_1134_Armstrong();
        System.out.println(obj.isArmstrong(153));
        System.out.println(obj.isArmstrong(247)); 
    }
    public boolean isArmstrong(int n) {
        int count =0;
        int x=n;
        int a=n;
        while(x>0){
            int digit_1 = x%10;
            count++;
            x/=10;
        }
        double sum =0;
        while(a>0){
            int digit = a%10;
            sum = sum + (int)Math.pow(digit,count);
            a/=10;
        }
        if(sum!=n){
            return false;
        }else{
            return true;
        }
    }
}