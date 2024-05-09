class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class This1 {
    public static void main(String[] arg) {
        Student s1 = new Student();
        s1.setAge(19);
        System.out.println(s1.getAge());
    }
}