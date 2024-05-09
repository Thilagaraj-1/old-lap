class Box2 {
    public static void main(String[] arg) {
        Integer i = new Integer(7);
        int x = i;// UnBoxing => converting to wrapper object to datatype
        System.out.println(i);
        System.out.println(x);
        i = x + 10;// Boxing => converting data_type to object
        System.out.println(i);

    }
}