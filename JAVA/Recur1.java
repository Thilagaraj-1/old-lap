public class Recur1 {
    static int x = 0;

    public static void main(String[] arg) {
        display();
    }

    public static void display() {
        x++;
        System.out.println("Hello World");
        if (x <= 5) {
            display();// Recursive call => A function calling in by itself
        }
    }
}
