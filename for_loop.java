// 22.for Loop

import java.util.Scanner;
public class for_loop {
    public static void main(String args[]){
        System.out.println("Enter the Limit  : ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i = 1;i<=n;i++){
            System.out.println(i);
        }
        scan.close();
    }
}
