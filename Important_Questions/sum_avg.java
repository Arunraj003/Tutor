package Important_Questions;

// 24.factorial -- important concept and questions with answer
// 2. write  a program to find the sum and average of given n number
import java.util.Scanner;

public class sum_avg {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = scan.nextInt();
        int sum =0,a;

        for(int i=1;i<=n;i++){
            System.out.println("Enter the number "+i+":  ");
            a=scan.nextInt();
            sum+= a; // sum = sum + a
        }
        System.out.println("The sum of given numbers is : " +sum);
        System.out.println("The avg of given numbers is : " +sum/n);
        scan.close();
    }
}
