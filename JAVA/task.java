import java.util.ArrayList;
import java.util.Scanner;

class task {
    public static void main(String[] arg) {
        ArrayList<String> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many String");
        int x = sc.nextInt();
        System.out.println("Enter the Strings:");

        for (int i = 1; i <= x; i++) {

            Scanner nc = new Scanner(System.in);
            String s = nc.next();
            li.add(s);

        }
        System.out.println("Your array list is below" + li);

    }
}
