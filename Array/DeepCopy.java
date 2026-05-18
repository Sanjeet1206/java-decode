package Array;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args){
        int[] arr = {10,20,30,40};

        int[] y = Arrays.copyOf(arr, arr.length);  // deep copy

        y[0] = 99;   // ✅ change copied array

        System.out.println(y[0]);   // 99
        System.out.println(arr[0]); // 10
    }
}