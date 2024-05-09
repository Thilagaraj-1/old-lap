class Excep15 {
    public static void main(String[] arg) {
        // try {
        // System.out.println("Name : " + arg[0]);
        // double gpa = Double.parseDouble(arg[1]);
        // System.out.println("GPA : " + gpa);
        // } catch (ArrayIndexOutOfBoundsException ae) {
        // System.out.println("Enter Name and GPA");
        // } catch (NumberFormatException ne) {
        // System.out.println("Enter Proper Numeric value");
        // } finally {
        // System.out.println("This executes all the time");
        // }
        try {
            System.out.println("Name : " + arg[0]);
            double gpa = Double.parseDouble(arg[1]);
            System.out.println("GPA  : " + gpa);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Enter Name and GPA");
        } finally {
            System.out.println("This executes all the time");
        }
    }
}
