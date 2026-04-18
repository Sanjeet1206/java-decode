package basic_cheeze;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the principal:  ");
        double p = sc.nextDouble();
        System.out.print("enter the rate:   ");
        double r = sc.nextDouble();
        System.out.print("enter the time:   ");
        double t = sc.nextDouble();
        double SI = p*r*t/100;
        System.out.print("SI:   "+ SI);


    }
}
