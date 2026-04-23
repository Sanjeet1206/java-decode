package If_else;
import java.util.Scanner;
public class DivisiblebyFiveOrThree {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.print("the number is divisible by 5 or 3");
        }else{
            System.out.print("the number is not divisible by 5 or 3");
        }
    }
}
