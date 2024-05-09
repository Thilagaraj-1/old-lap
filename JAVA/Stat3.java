/*
 A non static variable cannot be referenced inside a static method

 Any varaible declare inside a static method is by default static

 */
class Stat3 {
    int x;

    public static void main(String[] arg) {
        x = 10;
    }
}