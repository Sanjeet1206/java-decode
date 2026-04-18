package basic_cheeze;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
//        int r = 5;
//        double a = 3.14 * r * r;
//        System.out.println(a);
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius:  ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
