/*
    this acts as the same class object
    super acts as the parent(super) class object
*/

class Monkey {
    public String name;

    public void walk() {
        System.out.println("Monkey can Walk");
    }
}

class Human extends Monkey {
    public String name;

    public void walk() {
        System.out.println("Humans too can Walk");
        super.walk();
    }

    public void setNames() {
        super.name = "Monkey";
        this.name = "Human";
    }

    public void printNames() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}

class Super1 {
    public static void main(String[] arg) {
        Human h = new Human();
        h.walk();
        h.setNames();
        h.printNames();
    }
}