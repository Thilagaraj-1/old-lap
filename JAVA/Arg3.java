public class Arg3 {
    public static void main(String[] arg) {
        if (arg.length >= 3) {
            float f1 = Float.parseFloat(arg[0]);
            float f2 = Float.parseFloat(arg[1]);
            float f3 = Float.parseFloat(arg[2]);
            System.out.println(f1 + f2 + f3);
        } else {
            System.out.println("Provide min 3 inputs");
        }
    }

}
