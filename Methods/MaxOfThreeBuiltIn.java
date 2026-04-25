package Methods;
import java.util.Scanner;
public class MaxOfThreeBuiltIn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(Math.max(Math.max(a,b),c));
    }
}
