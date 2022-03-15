public class GroupPresident extends Student {
    public GroupPresident(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Group president: " + super.toString();
    }

    public void giveReport() {
        System.out.println("Reporting");
    }
}
