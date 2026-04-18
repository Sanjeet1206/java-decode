package basic_cheeze;

import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();
        System.out.println("enter the second number: ");
        int b = sc.nextInt();
        System.out.println("enter the third number: ");
        int c = sc.nextInt();
        System.out.println("total number:  ");
        System.out.println(a + b + c);

        sc.close();
    }
}
