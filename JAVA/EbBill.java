import java.util.*;

class EbBill {
    public static void main(String[] arg) {
        System.out.println("Enter the Units : ");
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        double amount = 0;
        double price[] = { 2, 3.5, 5, 7 };
        int t = units;

        for (int i = 0; i < (t / 100); i++) {
            units -= 100;
            if (i < (price.length - 1)) {
                System.out.println(100 + " x " + price[i] + " = " + (100 * price[i]));
                amount += (100 * price[i]);
            } else {
                System.out.println(units + " x " + price[price.length - 1] + " = " + (units * price[price.length - 1]));
                amount += (units * price[price.length - 1]);
                break;
            }
        }
    }

}