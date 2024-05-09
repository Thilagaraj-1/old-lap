class Car {
    Car() {
        System.out.println("Car Created");
        getInfo();
    }

    public void getInfo() {
        System.out.println("This is a new model Car");
    }
}

class Vehicle {
    Vehicle() {
    } // Empty Default Constructor

    public void getInfo() {
        System.out.println("This is a Vehicle");
    }
}

class Con1 {
    public static void main(String[] arg) {
        /*
         * // Car c1 = new Car();
         * Car c1; // Reference for the Object is created
         * c1 = new Car(); // Object is intantiated
         * c1.getInfo();
         * new Car().getInfo();
         */
        Vehicle v = new Vehicle();
        v.getInfo();
        Car c1 = new Car();
    }
}
/*
 * 1. Constructors are implicitly called while creating objects
 * 2. Objects can only be created by calling the constructor
 * along with the keyword new
 */