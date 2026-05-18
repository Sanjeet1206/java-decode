package Array;
import java.util.Scanner;

public class NegativeValues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        // input loop
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // print negative values
        System.out.print("Negative values are: ");
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}