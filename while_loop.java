// 21. while loop

import java.util.Scanner;

public class while_loop {
    public static void main(String args[]){
        // while loop
        System.out.println("Enter the limit : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i =1;

        // 1 <= n => user inputs
        while(i<=n){
            System.out.println(i);
            i++;
        }
        scan.close();
    }
    
}
