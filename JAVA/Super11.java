class Parent {
    public int var = 100;

    public void display() {
        System.out.println("Parent Method " + var);
    }
}

class Child extends Parent {
    public int var = 1000;

    public void display() {
        System.out.println("Child Method " + var);
        System.out.println("Super Class " + super.var);
        super.display();
    }
}

class Super11 {
    public static void main(String[] arg) {
        Child c1 = new Child();
        c1.display();
    }
}