import java.time.LocalDate;

public class Resolution {
    private String name;
    private String text;
    private LocalDate creationDate;

    public Resolution(String name, String text) {
        this.name = name;
        this.text = text;
        creationDate = LocalDate.now();
    }
}
