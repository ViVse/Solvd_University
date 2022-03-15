import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Group> groups = new ArrayList<Group>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public University(String name) {
        this.name = name;
    }

    public void addGroup(Group newGroup) {
        groups.add(newGroup);
    }

    public void addTeacher(Teacher newTeacher) {
        teachers.add(newTeacher);
    }

    public String toString() {
        String info = "University " + name + "\nGroups:";
        for(Group group : groups)
            info += "\n" + group.toString();
        info += "\nTeachers:";
        for(Teacher teacher : teachers)
            info += "\n" + teacher.toString();
        return info;
    }
}
