package If_else;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:   ");
        int n = sc.nextInt();

        if(n % 2 == 0){
         System.out.print("the number is even number");
        }else{
            System.out.print("the number is odd number");
        }
    }
}


