class Excep17 {
    public static void main(String[] arg) {
        MyClass mc = new MyClass();
        mc.myMethod();

    }
}

class MyClass {
    public void myMethod() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void myMethodX() throws InterruptedException {
        Thread.sleep(400);
    }
}