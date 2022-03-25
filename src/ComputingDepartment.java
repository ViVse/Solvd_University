import java.util.ArrayList;

public class ComputingDepartment extends AcademicDepartment {
    public ComputingDepartment() {
        super();
    }

    public ComputingDepartment(String name, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        super(name, groups, teachers);
    }

    @Override
    public void CreateCurriculum() {
        System.out.println("Created Math Curriculum");
    }
}
