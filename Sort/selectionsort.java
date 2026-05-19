import java.util.*;

public class selectionsort {

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

        // Selection  Sort starts
        for(int i = 0;i<arr.length-1;i++){
            int smallest=i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        

        // Print sorted array
        printArray(arr);
    }
}