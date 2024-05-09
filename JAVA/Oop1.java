class WaterTank {
    int waterLevel;
    int currentUsed;

    void motorStart() {
        waterLevel++;
        currentUsed++;
        System.out.println("motor started");
    }

    void motorStop() {
        waterLevel = 0;
        currentUsed = 0;
        System.out.println("motor stopped");
    }

    void currentCut() {
        waterLevel--;
        currentUsed = 0;
    }
}

class Oop1 {
    public static void main(String[] arg) {
        WaterTank w1;
        w1 = new WaterTank();
        w1.motorStart();
        w1.motorStop();
    }
}
