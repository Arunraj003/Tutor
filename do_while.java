// 22 . do-while loop

import java.util.Scanner;

public class do_while {
    public static void main(String args[]){
        System.out.println("Enter the limit : ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int i =1;
        do {
            System.out.println(i);
            i++;
        } while(i<=n);
        scan.close();
    }
}
