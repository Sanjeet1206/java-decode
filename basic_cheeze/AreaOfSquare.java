package basic_cheeze;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("side  ");
        int side = sc.nextInt();
        int area_of_square = side * side;
        System.out.print("area of square is:  ");



        System.out.println(area_of_square);
    }
}
