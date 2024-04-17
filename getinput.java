// 13. scanner

import java.util.Scanner;

public class getinput {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        // int a,b,c;
        /*
           nextInt();
           nextFloat();
           nextDouble();
           nextLine();
           next();
        */
        float a,b,c;
        System.out.println("Enter two numbers :");
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = (a*a)+(b*b)+(2*a*b);

        System.out.println("Result  :"+c);
        scan.close();
    }
}
