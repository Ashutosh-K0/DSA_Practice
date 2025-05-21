import java.util.*;

public class Second_Largest_Even_Odd_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest_even = Integer.MIN_VALUE;
        int largest_odd = Integer.MIN_VALUE;
        int slargest_even = Integer.MIN_VALUE;
        int slargest_odd = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] > largest_even) {
                largest_even = arr[i];
            }
            if (i % 2 != 0 && arr[i] > largest_odd) {
                largest_odd = arr[i];
            }
            if(i % 2 == 0 && largest_even>slargest_even && arr[i]>slargest_even){
                slargest_even = arr[]
            }
        }

        System.out.println("Largest element at an even index: " + largest_even);
        System.out.println("Largest element at an odd index: " + largest_odd);
        
        sc.close();
    }
}