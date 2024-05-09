/*
    1. In some condition we are not able to fully define a method
    2. Those methods are declared abstract
    3. If a class is containing an abstract method then the
        class is declared abstract
    4. Objects for the abstract classes cannot be initialized
    5. By inherting the abstract class and overriding the 
       abstract method, an object can be created for the 
       sub class
    6. An abstract class con contain both defined and 
       undefined methods
*/
abstract class Car {
    public abstract void start();

    public abstract void stop();

    public void getInfo() {
        System.out.println("This is a Car");
    }
}

class InnovaCar extends Car {
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }

}

class Abs1 {
    public static void main(String[] arg) {
        // Car c1 = new Car();
        /*
         * InnovaCar ic = new InnovaCar();
         * ic.start();
         * ic.stop();
         */
        Car c = new InnovaCar();
        c.start();
        c.stop();
        c.getInfo();
    }
}