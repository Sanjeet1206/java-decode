package Array;
import java.util.Scanner;
public class InputOutput {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] Karan = new int [7];
//        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i <= 5; i++)
//        System.out.println(arr[i] + " ");
//        int i = 0;
//        while(i<=5){
//            System.out.println(arr[i]+" ");
//            i++;
//        }
//        int n = arr.length;
//        for (int i = 0 ; i<n;i++)
//            System.out.println(arr[i]+" ");
//        int [] Karan = new int[7];
//        // default values
//        for (int i = 0; i<=7;i++){
//            System.out.print(Karan[i]+" ");
//        }
        for(int i = 0; i<7; i++){
            Karan[i]=sc.nextInt();
        }
        for(int i = 0; i<7;i++){
            System.out.print(Karan[i]+" ");
        }
    }
}
