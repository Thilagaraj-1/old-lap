class Employee {
    private String EmpName;
    private int EmpAge;
    private long EmpMobile;
    private String EmpPlace;

    void setEmpName(String n) {
        EmpName = n;
    }

    String getEmpName() {
        return EmpName;
    }

    void setEmpAge(int a) {
        EmpAge = a;
    }

    int getEmpAge() {
        return EmpAge;
    }

    void setEmpMobile(long m) {
        EmpMobile = m;
    }

    long getEmpMobile() {
        return EmpMobile;
    }

    void setEmpPlace(String p) {
        EmpPlace = p;
    }

    String getEmpPlace() {
        return EmpPlace;
    }
}

class Encap1 {
    public static void main(String[] arg) {
        Employee e1 = new Employee();
        e1.setEmpName("Naresh");
        e1.setEmpAge(19);
        e1.setEmpMobile(8825521129l);
        e1.setEmpPlace("Madurai");
        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpAge());
        System.out.println(e1.getEmpMobile());
        System.out.println(e1.getEmpPlace());
    }
}