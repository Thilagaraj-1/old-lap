class Vehicle {
    public void StartMethod() {
        System.out.println("Vehicle Started");
    }

    public void StopMethod() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {

}

class Bike extends Vehicle {

}

class Inher1 {
    public static void main(String[] arg) {
        Car c = new Car();
        c.StartMethod();
        c.StopMethod();

        Bike b = new Bike();
        b.StartMethod();
        b.StartMethod();
    }
}
