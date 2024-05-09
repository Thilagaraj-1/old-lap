class Excep11 {
    public static void main(String[] arg) {
        int x[] = { 1, 2, 3 };
        System.out.println("Before Exception");
        try {
            System.out.println(x[2]); // Exception
        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println(ae.getCause());

        }

        System.out.println("After Exception");
    }
}
/*
 * try{
 * //Normal Statements to try
 * }catch(Exception exception_object){
 * //Statments if exception occurs
 * }
 */