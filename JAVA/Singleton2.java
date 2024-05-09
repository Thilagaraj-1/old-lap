class Counter {
    private int amount;
    private static Counter obj;

    private Counter() {
    }

    public void setAmount(int amount) {
        this.amount = this.amount + amount;
    }

    public int getAmount() {
        return amount;
    }

    public static Counter getCounter() {
        if (obj == null) {
            obj = new Counter();
        }
        return obj;
    }
}

public class Singleton2 {
    public static void main(String[] arg) {
        Counter c1 = Counter.getCounter();
        c1.setAmount(1000);
        c1.setAmount(550);
        c1.setAmount(300);
        Counter c2 = Counter.getCounter();
        c2.setAmount(450);
        c2.setAmount(700);

        System.out.println(c1.getAmount());
        System.out.println(c2.getAmount());
    }
}
