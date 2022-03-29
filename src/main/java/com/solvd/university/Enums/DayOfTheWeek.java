package Enums;

public enum DayOfTheWeek{
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday"),
    SAT("Saturday"),
    SUN("Sunday");

    private final String value;

    DayOfTheWeek(String value){
        this.value = value;
    }

    public String getValue(){ return value;}
}
