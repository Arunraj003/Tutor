// 18.nested if 

import java.util.Scanner;

public class nested_if {
    public static void main(String args[]) {
        /*
         * A company insures its drivers in the following cases:
         * a: If the driver is married.
         * b: If the driver is unmarried, male & above 30 years of age.
         * c: If the driver is unmarried, female & above 25 years of age.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the martial status M/U");
        char martial = in.next().charAt(0);

        if (martial == 'u' || martial == 'U') {
            System.out.println("Enter the gender M/F: ");
            char gender = in.next().charAt(0);
            System.out.println("Enter the age: ");
            int age = in.nextInt();
            if ((gender == 'M' || gender == 'm') && age >= 30) {
                System.out.println("You are eligible for Insurance");
            } else if ((gender == 'M' || gender == 'm') & age >= 25) {
                System.out.println("You are eligible for Insurance");
            } else{
                System.out.println("Not eligible for insurance");
            }
            in.close();

        } else if (martial == 'm' || martial == 'M') {
            System.out.println("You are eligible for Insurance");
        } else {
            System.out.println("Invalid input");
        }
    }
}
