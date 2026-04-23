package If_else;
import java.util.Scanner;
public class SidesOfTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a = sc.nextInt();
        System.out.print("enter the second number: ");
        int b = sc.nextInt();
        System.out.print("enter the third number: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("valid triangle.");
        }else{
            System.out.println("invalid triangle.");
        }
    }
}
