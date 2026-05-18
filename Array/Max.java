package Array;

public class Max {
    public static void main(String[] args){
        int[] arr = {4,2,1,6,5};
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
