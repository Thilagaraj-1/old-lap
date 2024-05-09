/*
 Without modifying the method signature redefining the 
 super class method in the sub class is called 
 method overriding

 On overiding the super class method in the sub class
 It hides/shadows the super class method
 */
class Vehicle {
    public void start() {
        System.out.println("Vehicle Started");
    }

    public void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car Started");
    }
}

class Bus extends Vehicle {
    public void start() {
        System.out.println("Bus Started");
    }
}

class Inher2 {
    public static void main(String[] arg) {
        /*
         * Car c1 = new Car();
         * c1.start();
         * c1.stop();
         * 
         * Bus b1 = new Bus();
         * b1.start();
         * b1.stop();
         */
        /*
         * Super class reference can hold sub class object
         * Vehicle v = new Car();
         * v.start();
         * v.stop();
         * v = new Bus();
         * v.start();
         * v.stop();
         */
        /*
         * Sub class reference cannot hold super class object
         * Car c = new Vehicle();
         */
    }
}