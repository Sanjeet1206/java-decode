package If_else;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.print("number is divisible by 5");
        }else{
            System.out.print("the number is not divisible by 5");
        }
    }
}
