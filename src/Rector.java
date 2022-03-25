import Documents.Resolution;
import Interfaces.IRector;

import java.util.Random;

public final class Rector extends Human implements IRector {
    public Rector() {}

    public Rector(String name, String surname, int age) {
        super(name, surname, age, null, null);
    }

    @Override
    public Resolution CreateResolution() {
        Random random = new Random();
        String name = "Documents.Resolution #" + random.nextInt(1000);
        String text = "Sample text";
        return new Resolution(name, text);
    }

    @Override
    public void MakeSpeech() {
        System.out.println("Delivering a speech");
    }
}
