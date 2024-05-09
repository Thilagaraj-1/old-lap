/*
Interfaces
    pure abstract class

interface interface_name{
    method declarations
}

class sub_class_name implements interface_name{

}
*/

// abstract class Car{
//     public abstract void start();
//     public abstract void stop();
// }

interface Car {
    public void start();

    public void stop();
}

class InnovaCar implements Car {
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
}

class Intf1 {
    public static void main(String[] arg) {
        Car c1 = new InnovaCar();
        c1.start();
        c1.stop();
    }
}