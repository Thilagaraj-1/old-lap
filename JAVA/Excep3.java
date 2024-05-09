class MyClass {
    public void myMethod() {
        System.out.println("My Method");
    }
}

class Parent {
    public void parentMethod() {
        System.out.println("My Method");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("My Method");
    }
}

class Excep3 {
    public static void main(String[] arg) {
        MyClass mc = null;
        int x = 5, y = 0;
        Child c = (Child) new Parent();
        c.parentMethod();
    }
}