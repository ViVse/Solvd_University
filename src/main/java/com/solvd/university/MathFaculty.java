import java.util.ArrayList;

public class MathFaculty extends Faculty {

    public MathFaculty() {
        super("Faculty of Math", null);
    }

    public MathFaculty(ArrayList<AcademicDepartment> departments) {
        super("Faculty of Math", departments);
    }
}
