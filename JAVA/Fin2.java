/*
 Final methods cannot be overrided
 If we need to lock a method from overriding the method 
 can be declared final in the super class


Final class cannot be inherited
If we need to lock a class from inherting the class can be
declared final
 */
final class Parent {
    // public final void display(){
    public void display() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {

    public void display() {
        System.out.println("Child Class");
    }
}

class Fin2 {
    public static void main(String[] arg) {
        Child c1 = new Child();
        c1.display();
    }
}