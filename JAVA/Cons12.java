class Student {
    private String name;
    private int age;

    // public Student(){
    // System.out.println("Student");
    // }
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

class Cons12 {
    public static void main(String[] arg) {
        Student s1 = new Student("Naresh", 18);
        // Student s1 = new Student();
        System.out.println(s1.getName() + " " + s1.getAge());
    }
}