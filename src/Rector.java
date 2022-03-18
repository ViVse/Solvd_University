import java.util.Random;

public class Rector extends Human {
    public Rector() {}

    public Rector(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Resolution createResolution() {
        Random random = new Random();
        String name = "Resolution #" + random.nextInt(1000);
        String text = "Sample text";
        return new Resolution(name, text);
    }
}
