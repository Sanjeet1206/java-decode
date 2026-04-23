package If_else;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:    ");
        int n = sc.nextInt();
        if(n>= -68 && n<=68){
            System.out.print("the magnitude of "+ n +" is smaller than 69");
        }else{
            System.out.print("the magnitude of "+n+" is greater than or equal to 69");
        }
    }
}
