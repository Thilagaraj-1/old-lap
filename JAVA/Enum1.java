class Days {
    public String getDay(int day) {
        switch (day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";

        }
        return "";
    }
}

class Enum1 {
    public static void main(String[] arg) {
        Days d = new Days();
        System.out.println(d.getDay(6));
        System.out.println(d.getDay(0));
        System.out.println(d.getDay(2));
        System.out.println(d.getDay(0));
        System.out.println(d.getDay(3));
    }
}