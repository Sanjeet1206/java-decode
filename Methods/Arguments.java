package Methods;

public class Arguments {
//    public static void sum(int a , int b){      //parameter int a and int b
//        System.out.print(a+b);
//    }
//    public static void main(String[] args){
//        sum(5,8);                               //arguments
//    }

    public static void max(int a , int b , int c){
        System.out.println(Math.max(Math.max(a,b),c));
    }
    public static void main(String[] args){
        max(4,5,8);
    }
}