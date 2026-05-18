package Array;

public class ArrayKiBasics {
    public static void main (String[] args){
        // indexing
        int[] x = {10,20,30,40,50};
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        //updating
        x[2] = 60;
        System.out.println(x[2]);
        //initialization and indexing
        int[] arr = new int[3];
        arr[0] = 70;
        arr[1]= 80;
        arr[2]= 90;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
