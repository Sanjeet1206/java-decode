import java.util.*;

public class insertionsort {

    // Function to print array
    public static void printArray(int arr[]) {

        // Loop through array elements
        for(int i = 0; i < arr.length; i++) {

            // Print each element
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        // Array declaration
        int arr[] = {7, 8, 3, 1, 2};

        // insertion  Sort starts
        for(int i =1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        

        // Print sorted array
        printArray(arr);
    }
}