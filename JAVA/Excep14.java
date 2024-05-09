import java.util.*;

class MyMath {
    int x, y;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            x = Integer.parseInt(scanner.next());
            y = Integer.parseInt(scanner.next());
        } catch (NumberFormatException ne) {
            System.out.println("Give Number as Input");
            getInput();
        }
    }

    public void showData() {
        System.out.println("x = " + x + " y = " + y);
    }
}

class Excep14 {
    public static void main(String[] arg) {
        MyMath mm = new MyMath();
        mm.getInput();
        mm.showData();
    }
}