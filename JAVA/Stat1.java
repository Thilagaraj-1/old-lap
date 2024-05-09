/*
 Static variables shares common memory among the objects
 */
class Counter {
    private int amount;

    public void setAmount(int amount) {
        this.amount = this.amount + amount;
    }

    public int getAmount() {
        return amount;
    }
}

class Stat1 {
    public static void main(String[] arg) {
        Counter c1 = new Counter();
        c1.setAmount(1000);
        c1.setAmount(550);
        c1.setAmount(300);
        Counter c2 = new Counter();
        c2.setAmount(450);
        c2.setAmount(700);

        System.out.println(c1.getAmount());
        System.out.println(c2.getAmount());
    }
}