import java.util.ArrayList;

public class Faculty {
    String name;
    ArrayList<AcademicDepartment> departments = new ArrayList<AcademicDepartment>();

    public Faculty(String name) {
        this.name = name;
    }

    public void addDepartment(AcademicDepartment newDepartment) {
        departments.add(newDepartment);
    }

    public String toString() {
        String info = "Faculty " + name + "\nAcademic departments:";
        for(AcademicDepartment department: departments)
            info += "\n" + department.toString();
        return info;
    }
}
