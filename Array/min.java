package Array;

public class min {
    public static void main(String[] args){
        int[] arr = {4,2,1,6,5};
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min) min = arr[i];
        }
        System.out.println(min);
    }
}
