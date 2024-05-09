class Excep12 {
    public static void main(String[] arg) {
        /*
         * Code without Exception Handling
         * int x = 10, y = 0;
         * int result = x / y;
         * System.out.println(result);
         */
        // Code with Exception Handling
        int x = 10, y = 0;
        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println("Some mathematical Exception occured");
        }
    }
}