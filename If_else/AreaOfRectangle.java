package If_else;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("enter the breadth of rectangle: ");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        System.out.println("Area of Rectangle is: "+area);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
        if(area>perimeter){
            System.out.println("the area of rectangle is greater than perimeter.");
        }else if(area<perimeter){
            System.out.println("the area of rectangle is lesser than perimeter.");
        }else{
            System.out.println("the area is equal to its perimeter.");
        }
    }
}
