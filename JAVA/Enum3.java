enum Status {
    PRESENT("Present"),
    LEAVE("Leave"),
    ABSENT("Absent"),
    HALF_DAY("Half a Day");

    public String value;

    private Status(String value) {
        this.value = value;
    }
}
/*
 * enum Status{
 * PRESENT(0),
 * LEAVE(1),
 * ABSENT(2),
 * HALF_DAY(3);
 * public int value;
 * private Status(int value){
 * this.value = value;
 * }
 * }
 */
/*
 * enum Status{
 * PRESENT,
 * LEAVE,
 * ABSENT,
 * HALF_DAY
 * }
 */

class Student {
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status geStatus() {
        return status;
    }
}

class Employee {
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}

class Enum3 {
    public static void main(String[] arg) {
        Student s1 = new Student();
        s1.setStatus(Status.LEAVE);
        System.out.println(s1.geStatus());
        System.out.println(s1.geStatus().value);
        Employee e = new Employee();
        e.setStatus(Status.HALF_DAY);
        System.out.println(e.getStatus());
        System.out.println(e.getStatus().value);

        System.out.println(Status.values());

        for (Status s : Status.values()) {
            System.out.println(s);
        }

        for (Status s : Status.values()) {
            System.out.println(s.value);
        }
    }
}