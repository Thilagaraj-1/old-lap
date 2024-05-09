// Scope

class Scope1 {
    static int g = 10;

    public static void main(String[] arg) {
        int m = 100;
        System.out.println(m);
        System.out.println(g);
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(i);
        display();
    }

    public static void display() {
        int d = 1000;
        System.out.println("Display function running");
        System.out.println(g);
    }
}