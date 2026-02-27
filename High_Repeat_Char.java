import java.util.*;
public class High_Repeat_Char{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char maxChar = ' ';
        int maxCount = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("The character with the highest frequency is: "+maxChar+" with count: "+maxCount);
    }
}