package Important_Questions;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        // 3. Write a program to find fibonacci seriesof given number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scan.nextInt();
        int a=-1,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b; // 0
            System.out.println(c);
            a=b;  // 1
            b=c; // 0
        }
        scan.close();
    }
}
