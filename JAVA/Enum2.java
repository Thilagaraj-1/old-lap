/*
enum => Ennumeration
enum enum_name{
    value 1,
    value 2
}
*/

enum Days{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

class WeekDays{
    public String getDayName(Days d){
        switch(d){
            case SUNDAY:
                return "Sunday";
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
        }
        return "";
    }
}

class Enum2{
    public static void main(String[] arg){
        WeekDays wd = new WeekDays();
        System.out.println(wd.getDayName(Days.SATURDAY));
        System.out.println(wd.getDayName(Days.MONDAY));
    }
}