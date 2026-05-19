import java.util.*;

public class bubblesort {

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

        // Bubble Sort starts
        for(int i = 0; i < arr.length - 1; i++) {

            // Compare adjacent elements
            for(int j = 0; j < arr.length - i - 1; j++) {

                // Swap if left element is greater
                if(arr[j] > arr[j + 1]) {

                    // Swapping process
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        printArray(arr);
    }
}