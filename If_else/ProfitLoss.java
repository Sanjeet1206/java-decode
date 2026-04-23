package If_else;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost price:   ");

        int cp = sc.nextInt();
        System.out.print("enter the selling price: ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit is  "+(sp-cp));
        }else if(sp < cp){
            System.out.println("Loss is "+(cp-sp));
        }else{
            System.out.println("Loss is   "+(cp-sp));
        }

    }
}
