import java.time.LocalDate;

public class Resolution {
    private String name;
    private String text;
    private LocalDate creationDate;

    public Resolution() {}

    public Resolution(String name, String text) {
        this.name = name;
        this.text = text;
        creationDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}
