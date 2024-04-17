// 15.ifcondition

import java.util.Scanner;

public class ifcondition {
    public static void main(String args[]){
        int age;
        System.out.println("Enter your age :");
        Scanner inp = new Scanner(System.in);
        age= inp.nextInt();

        if(age >=18){
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        }
        inp.close();
    }
}
