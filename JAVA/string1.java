class Str1 {
    public static void main(String[] arg) {
        String s1 = "Hello World";
        String s2 = "Mother Earth";
        String s3 = s2 + s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.charAt(5));
        System.out.println("First Letter of String s1 " + s1.charAt(0));
        System.out.println("Last Letter of String s1 " + s1.charAt(s1.length() - 1));
        System.out.println(s1.substring(0, 5));
    }
}