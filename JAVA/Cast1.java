/*
Type Casting
    Converting data_types of one form to another form
*/

class Cast1 {
    public static void main(String[] arg) {
        int x = 10;
        double d = x;// Implicit Type casting (No necessary for extra code)
        d = 3.14;
        x = (int) d;// Explicit Type casting (Need to specify the data_type for casting)
        System.out.println(x);
        System.out.println(d);

    }
}