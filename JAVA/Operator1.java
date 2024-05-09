class Operator1 {
    public static void main(String[] arg) {
        int x = 50;
        int y = 10;
        System.out.println("Arithmetic Operators");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x + y);
        System.out.println(x + y);
        System.out.println(++x);
        System.out.println(--y);
        System.out.println("Assignment Operators");
        System.out.println(x += y);
        System.out.println(x -= y);
        System.out.println(x *= y);
        System.out.println(x /= y);
        System.out.println(x %= y);
        System.out.println(x &= y);
        System.out.println(x |= y);
        System.out.println(x ^= 3);
        System.out.println(x >>= 3);
        System.out.println(x <<= 3);
        System.out.println("Comparison Operator");
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x < 5 && x < 10);
        System.out.println(x < 5 || x < 10);
        System.out.println(!(x < 5 && x < 10));
    }

}