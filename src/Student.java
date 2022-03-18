import java.util.ArrayList;

public class Student extends Human{
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    private boolean presence;
    private ArrayList<Lecture> learnedLectures = new ArrayList<>();

    public Student(String name, String surname, int age) {
        super(name, surname, age);
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

    public void addMark(int mark) {
        marks.add(mark);
    }

    public void learn(Lecture lecture) {
        learnedLectures.add(lecture);
    }

    public String toString() {
        return super.toString();
    }
}
