// 16.if - else 

import java.util.Scanner;

public class if_else_statement {
    public static void main(String args[]){
        int year;
        System.out.println("Enter year :");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        // century year / 100 and divide by 400 leap year

        if(year % 4 ==0 || (year % 100 ==0 && year %400 ==0)){
            System.out.println("Year " + year + "is a leap Year");
        }
        else {
            System.out.print("Year " + year + "is not a leap Year");
        }
        in.close();
    }    
}
