import java.util.*;
public class Carry_Count{
    public static void main(String[] args){
        int num1, num2, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        while(num1>0 || num2>0){
            int digit1 = num1%10;
            int digit2 = num2%10;
            int sum = digit1 + digit2;
            if(sum>9){
                count++;
            }
            num1=num1/10;
            num2=num2/10;
        }
        System.out.println("The Carry count is: "+count);
    }
}