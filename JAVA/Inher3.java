class A {
    A() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    B() {
        System.out.println("This is Class B");
    }
}

class C extends B {
    C() {
        System.out.println("This is Class C");
    }
}

class Inher3 {
    public static void main(String[] arg) {
        C c = new C();
    }
}