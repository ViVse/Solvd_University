import Documents.Resolution;

import java.util.Random;

public class Rector extends Human {
    public Rector() {}

    public Rector(String name, String surname, int age) {
        super(name, surname, age, null, null);
    }

    public Resolution createResolution() {
        Random random = new Random();
        String name = "Documents.Resolution #" + random.nextInt(1000);
        String text = "Sample text";
        return new Resolution(name, text);
    }
}
