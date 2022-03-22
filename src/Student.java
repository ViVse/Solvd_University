import java.util.ArrayList;

public class Student extends Human{
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    private boolean presence;

    public Student() {}

    public Student(String name, String surname, int age, ArrayList<Integer> marks) {
        super(name, surname, age, null, null);
        this.marks = marks;
        presence = true;
    }

    public void goToLessons() {
        presence = true;
    }

    public void stayHome() {
        presence = false;
    }

    public boolean getPresence() {
        return  presence;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public String toString() {
        return super.toString();
    }
}
