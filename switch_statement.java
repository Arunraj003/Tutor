
// 19. switch
import java.util.Scanner;

public class switch_statement {
    public static void main(String args[]) {

        int a, b, c, ch;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice :");
        
        Scanner scan = new Scanner(System.in);
        ch = scan.nextInt();
        System.out.println("Enter two numbers :");
        a=scan.nextInt();
        b=scan.nextInt();
        switch (ch) {
            case 1:
            c=a+b;
                System.out.println("1.Addition  " + c) ;
                break;
            case 2:
            c=a-b;
                System.out.println("2.Subtraction  "+ c);
                break;
            case 3:
            c=a*b;
                System.out.println("3.Multiplication  "+c);
                break;
            case 4:
            c=a/b;
                System.out.println("4.Division  "+c);
                break;
            default:
                System.out.println("Invlaid Selection");
                break;
            }
            scan.close();
    }
}
