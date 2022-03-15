public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 18);
        Student student2 = new Student("Oleh", 18);
        Student student3 = new Student("Sasha", 18);
        GroupPresident president = new GroupPresident("Igor", 20);

        Teacher teacher = new Teacher("Olha", 30, "math");
        Curator curator = new Curator("Vlad", 40, "OOP");

        Group group = new Group(244, curator, president);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        University university = new University("Chnu");
        university.addGroup(group);
        university.addTeacher(teacher);

        System.out.println(university);
    }
}
