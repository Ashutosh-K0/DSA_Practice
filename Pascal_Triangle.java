import java.util.*;
public class Pascal_Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+" ");
            }
            System.out.println();
        }
    }
    public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}