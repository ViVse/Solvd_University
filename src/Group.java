import java.util.ArrayList;

public class Group {
    private int number;
    private Curator curator;
    private GroupPresident president;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Group() {}

    public Group(int number, Curator curator, GroupPresident president) {
        this.number = number;
        this.curator = curator;
        this.president = president;
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
        return info;
    }
}
