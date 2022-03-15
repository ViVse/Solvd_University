public class Teacher extends Human {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching " + subject);
    }

    public String toString() {
        return super.toString() + ", subject: " + subject;
    }
}
