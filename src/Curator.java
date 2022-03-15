public class Curator extends Teacher{

    public Curator(String name, int age, String subject) {
        super(name, age, subject);
    }

    public void curate() {
        System.out.println("Curating");
    }

    public String toString() {
        return "Curator: " + super.toString();
    }
}
