import java.util.*;
public class Character_Freq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        if(str.length()==0 || str==null){
            System.out.println("Empty String");
        }
        int count =1;
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i - 1))
                count++;
            else{
                result.append(str.charAt(i-1)).append(count);
                count =1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);
    }
}