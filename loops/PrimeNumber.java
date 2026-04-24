package loops;

import java.util.Scanner;
import java.lang.Math;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int x = 0; //prime we can also write flag = true means it is prime
//        for (int i = 2; i <= n - 1; i++)
          for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                x = 1;  //composite we can also write flag = false means it is Composite
                break;
            }
        }
        if(n==1){
            System.out.print("neither prime nor composite");
        }
       else if(x==1){
            System.out.print("Composite Number");
        }else{
            System.out.print("Prime number");
        }
    }
}
