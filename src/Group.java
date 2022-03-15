import java.util.ArrayList;

public class Group {
    private int number;
    private Curator curator;
    private GroupPresident president;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Group(int number, Curator curator, GroupPresident president) {
        this.number = number;
        this.curator = curator;
        this.president = president;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public String toString() {
        String info = "Group: " + number + "\n" + curator.toString() + "\n" + president.toString() + "\nStudents:";
        for(Student student: students)
            info += "\n" + student.toString();
        return info;
    }
}
