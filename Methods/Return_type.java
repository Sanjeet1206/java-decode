package Methods;

public class Return_type {
//    public static int prasun(){
//        System.out.println("bhanu");
//        System.out.println("nanda");
//        return 5;
//    }
//    public static void main(String[] args){
////        System.out.println(3+prasun());
////          prasun();
//    }
    public static int prasun(int a){
        System.out.println("bhanu");
        if(a>0){
            return 5;
        }else{
            return 10;
        }
    }
    public static void main(String[] args){
        int x = prasun(7);
        System.out.println(3+x);
    }
}
