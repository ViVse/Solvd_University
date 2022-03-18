public class Lecture {
    private String subject;
    private String theme;
    private String info;

    public Lecture() {}

    public Lecture(String subject, String theme, String info) {
        this.subject = subject;
        this.theme = theme;
        this.info = info;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String theme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
