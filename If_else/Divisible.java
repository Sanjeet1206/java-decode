package If_else;
import java.util.Scanner;
public class Divisible {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:  ");
        int n = sc.nextInt();
        if((n%3==0 && n%5==0)){
            System.out.println("Riya");
        }else if(n%3==0){
            System.out.println("Banu");
        }else if(n%5==5){
            System.out.println("Apoorva");
        }else{
            System.out.println("Isha");
        }


    }
}
