package Array;

public class Product {
    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.print(product);
    }
}
