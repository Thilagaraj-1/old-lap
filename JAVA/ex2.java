import java.util.*;

public class ex2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EB Units");
        int x = scanner.nextInt();
        if (x <= 100) {
            System.out.println("no cost");
        }
        if (x <= 200) {
            System.out.println("EB Bill amount is " + (x - 100) * 2);
        }
        if (x <= 300) {
            System.out.println("EB Bill amount is " + (x - 100) * 3.50);
        }
        if (x <= 400) {
            System.out.println("EB Bill amount is " + (x - 100) * 5);
        }
        if (x < 500) {
            System.out.println("EB Bill amount is " + (x - 100) * 7.50);
        }
    }

}
