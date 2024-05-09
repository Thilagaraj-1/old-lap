class Excep16 {
    public static void main(String[] arg) {

        try {
            System.out.println("Name : " + arg[0]);
            double gpa = Double.parseDouble(arg[1]);
            System.out.println("GPA  : " + gpa);
        } catch (Exception e) {
            System.out.println("Some Exceptions occured");
        } finally {
            System.out.println("This executes all the time");
        }

    }
}