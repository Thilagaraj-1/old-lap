/*
 Checked Exceptions must be caught
 */
class Excep13 {
    public static void main(String[] arg) {
        System.out.println("Started....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("Some Exceptions Occured");
        }
        System.out.println("Ended....");
    }
}