public class Main {
    public static void main(String[] args) {

        Schedule schedule = new Schedule();

        schedule.addLecture(DayOfTheWeek.Mon, new Lecture("test", "test", "test"));
        schedule.addLecture(DayOfTheWeek.Mon, new Lecture("test1", "test1", "test1"));
        schedule.addLecture(DayOfTheWeek.Thu, new Lecture("test", "test", "test"));

        System.out.println(schedule);
    }
}
