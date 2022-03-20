import java.util.ArrayList;

public class University {
    private String name;
    private Rector rector;
    private ArrayList<Faculty> faculties = new ArrayList<Faculty>();
    private ArrayList<Resolution> resolutions = new ArrayList<Resolution>();

    public University() {}

    public University(String name, Rector rector) {
        this.name = name;
        this.rector = rector;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public ArrayList<Resolution> getResolutions() {
        return resolutions;
    }

    public void setResolutions(ArrayList<Resolution> resolutions) {
        this.resolutions = resolutions;
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
