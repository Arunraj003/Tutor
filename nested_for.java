// 24.nested-for star matrix patterns

public class nested_for {
    public static void main(String args[]) {
        // for using matrix
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
