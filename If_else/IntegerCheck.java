package If_else;

import java.util.Scanner;

public class IntegerCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x > 0){
            System.out.print("not an integer");
        }else{
            System.out.print("integer");
        }
    }
}
