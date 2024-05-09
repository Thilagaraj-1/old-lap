/*
    data_type var_name;
    Primitive Datatypes
        char
        int
        short
        long
        float
        double
        boolean

    int x;

*/

class Vars {
    public static void main(String[] arg) {
        // Without intialization a varaible cannot be used
        // int x;
        int x = 10, y = 20;
        System.out.println(x);
        System.out.println("x = " + x);// concat
        System.out.println(x + y);
        System.out.println("x = " + x + y);
        System.out.println(x + y + "x = ");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x = " + x + "\ny = " + y);
        System.out.println("\tx = " + x + "\n\ty = " + y);

    }
}

// x = val, y = val
/*
 * Esacape Sequences
 * /n
 * /t
 * //
 * /"
 * /r
 * /b
 * 
 */