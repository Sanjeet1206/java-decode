package Array;

import java.util.Arrays;   // ❗ also missing import

public class BuiltInMethod {
    public static void main(String[] args){
        int[] arr = {4,1,7,5,10,2};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr){   // ✅ static added
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}