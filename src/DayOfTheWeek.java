enum DayOfTheWeek{
    Mon("Monday"), Tue("Tuesday"), Wed("Wednesday"), Thu("Thursday"), Fri("Friday"), Sat("Saturday"), Sun("Sunday");
    private String day;
    DayOfTheWeek(String day){
        this.day = day;
    }
    public String getDay(){ return day;}
}
