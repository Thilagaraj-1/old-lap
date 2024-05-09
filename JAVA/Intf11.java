interface Engine {
    public void start();

    public void stop();
}

class Car implements Engine {
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    public void stop() {
        System.out.println("Car Stopped");
    }
}

class Intf11 {
    public static void main(String[] arg) {
        Engine e = new Engine() {
            @Override
            public void start() {
                System.out.println("Car Started");
            }

            @Override
            public void stop() {
                System.out.println("Car Stopped");
            }
        };

        e.start();
        e.stop();
    }
}