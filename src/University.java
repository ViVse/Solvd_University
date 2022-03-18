import java.util.ArrayList;

public class University {
    private String name;
    private Rector rector;
    private ArrayList<Faculty> faculties = new ArrayList<Faculty>();
    private ArrayList<Resolution> resolutions = new ArrayList<Resolution>();

    public University(String name, Rector rector) {
        this.name = name;
        this.rector = rector;
    }

    public void addFaculty(Faculty newFaculty) {
        faculties.add(newFaculty);
    }

    public void addResolution() {
        Resolution newResolution = rector.createResolution();
        resolutions.add(newResolution);
    }

    public String toString() {
        String info = "University " + name + "\nRector: " + rector.toString() + "\nFaculties:";
        for(Faculty faculty: faculties)
            info += "\n" + faculty;
        return info;
    }
}
