/*
Runtime Inputs
    Command Line args

*/

class Arg1 {
    public static void main(String[] arg) {
        /*
         * int x[] = {1,2,3};
         * System.out.println(x[0]);
         * System.out.println(x[3]);
         */
        /*
         * System.out.println(arg[0]);
         * System.out.println(arg.length);
         */
        System.out.println("The given inputs are ");
        for (String s : arg) {
            System.out.println(s);
        }
    }
}