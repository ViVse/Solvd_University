import java.util.ArrayList;

public final class GroupPresident extends Student {
    public GroupPresident() {}

    public GroupPresident(String name, String surname, int age, ArrayList<Integer> marks) {
        super(name, surname, age, marks);
    }

    public String toString() {
        return "Group president: " + super.toString();
    }

    public void giveReport(ArrayList<Student> students) {
        System.out.println("Reporting\n " + countAbsentStudents(students) + "students are absent.");
    }

    public void fillJournal() {
        System.out.println("Filled the journal");
    }

    private int countAbsentStudents(ArrayList<Student> students) {
        int number = 0;
        for(Student student: students) {
            if(!student.getPresence()) number++;
        }

        return number;
    }
}
