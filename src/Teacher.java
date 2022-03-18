import java.util.ArrayList;
import java.util.Random;

public class Teacher extends Human {
    private String subject;
    private ArrayList<Lecture> lectures = new ArrayList<>();

    public  Teacher() {}

    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void giveMark(Student student) {
        Random random = new Random();
        int mark = random.nextInt(5) + 1;
        student.addMark(mark);
    }

    public void prepareLecture() {
        Lecture newLecture = new Lecture(subject, "Random theme", "Some info");
        lectures.add(newLecture);
    }

    public void teach(Student student) {
        Random random = new Random();
        Lecture lecture = lectures.get(random.nextInt(lectures.size()));
        student.learn(lecture);
    }

    public String toString() {
        return super.toString() + ", subject: " + subject;
    }
}
