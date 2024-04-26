package Important_questions;

import java.util.Scanner;
public class reverse_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt(); //123  
        int reverse = 0,rem;  //123!=0   12!=0

        while(n!=0){
            rem=n%10; //3
            reverse =(reverse*10)+rem; //(0*10)+3=>3 
            n=n/10;  //12 
        }
        scan.close();
        System.out.println("Reversed Number : " + reverse);
    }
}
