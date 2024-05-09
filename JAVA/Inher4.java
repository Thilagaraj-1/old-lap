class Parent {
    Parent() {
        System.out.println("Parent Empty Constructor");
    }

    Parent(String s) {
        System.out.println("Parent String Constructor " + s);
    }
}

class Child extends Parent {
    Child() {
        super("I Choosed this");
        System.out.println("Child Empty Constructor");
    }

    Child(String s) {
        System.out.println("Child String Constructor " + s);
        // super(s);
    }
}

class Inher4 {
    public static void main(String[] arg) {
        Child c1 = new Child();
        // Child c2 = new Child("Some String");
    }
}