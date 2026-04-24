package loops;
import java.util.Scanner;
public class GP1 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int a = 1,r = n;
        for(int i = 1; i<=n;i++){
            System.out.print(a+" ");
            a*=n;
        }
    }
}
