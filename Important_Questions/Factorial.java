package Important_questions;
// 24.factorial -- important concept and questions with answer
// 1. write  a program to find the factorial of given number
// 5! => 1 x 2 x 3 x 4 x 5 => 120

import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int f =1;
        // always start with 1 
        for(int i = 1;i<=n;i++){   // 1 <=5 2<=5 
            f=f*i;
        }
        System.out.println("Factorial of " + n + "is " + f);
        scan.close();
    }
}
