class Box3 {
    public static void main(String[] arg) {
        Double d = 3.14;
        System.out.println(d);
        System.out.println(d * d);
        double pi = d;
        System.out.println(pi);
        String s = d.HexString(17);
        System.out.println(s);

        int x = 100;
        float f = x;
        double d = 2.14;
        f = (float) d;
    }
}
