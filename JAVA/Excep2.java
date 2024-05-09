/*
try{
    normal statements to process
}catch(exception obj){
    statements if exception occurs
}

UnChecked Exceptions
    UnChecked Exceptions are occured while running a program It can be handled 
    or left un hnadled
        Ex:
            ArithematicException
            ArrayIndexOutOfBoundsException
            ClassCastException
            NumberFormatException

Checked Exceptions 
    Checked Exceptions must be handled at the time of writing the code
    or else the program doesn't get Compiled
    Ex:
        IOExceptionException
        InterruptedException
 */
class Excep2 {
    public static void main(String[] arg) {
        try {
            int x[] = { 10, 20, 30 };
            System.out.println("Before Exception");
            System.out.println(x[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Element refered is not available");
        }
        System.out.println("After Exception");

    }
}