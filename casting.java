// 05.Type casting 
/*
  widening casting s-b
    byte -> short -> char -> int -> long -> float -> double
  Narrow Casting b-s
    double -> float -> long -> int -> char -> short -> byte
*/

public class casting {
    public static void main(String args[]){
          int a = 10;
          double b = a , d=25.5382;
          System.out.println("Int :" + a);
          System.out.println("Double :" + b);
          
          int c=(int)d; // decimal to int 
          System.out.println("Double :" + d);
          System.out.println("Int :" + c);
    }
}
