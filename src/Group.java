import java.util.ArrayList;

public class Group {
    private int number;
    private Curator curator;
    private GroupPresident president;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Schedule schedule;

    public Group() {}

    public Group(int number, Curator curator, GroupPresident president, Schedule schedule, ArrayList<Student> students) {
        this.number = number;
        this.curator = curator;
        this.president = president;
        this.schedule = schedule;
        this.students = students;
    }

    public void setGroupNumber(int number) {
        this.number = number;
    }

    public int getGroupNumber() {
        return number;
    }

    public Curator getCurator() {
        return curator;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public GroupPresident getGroupPresident() {
        return president;
    }

    public void setGroupPresident(GroupPresident president) {
        this.president = president;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void getPresidentReport() {
        president.giveReport(students);
    }

    public String toString() {
        String info = "Group: " + number + "\n" + curator.toString() + "\n" + president.toString() + "\nStudents:";
        for(Student student: students)
            info += "\n" + student.toString();
        info += "\n" + schedule.toString();
        return info;
    }
}
