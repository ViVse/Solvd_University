package com.solvd.university;

import com.solvd.university.Documents.Resolution;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class University {

    private static final Logger LOGGER = LogManager.getLogger(Teacher.class);
    private String name;
    private Rector rector;
    private ArrayList<Faculty> faculties = new ArrayList<Faculty>();
    private ArrayList<Resolution> resolutions = new ArrayList<Resolution>();

    public University() {

    }

    public University(String name, Rector rector, ArrayList<Faculty> faculties, ArrayList<Resolution> resolutions) {
        this.name = name;
        this.rector = rector;
        this.faculties = faculties;
        this.resolutions = resolutions;
    }

    public String getName() { return name; }

    public void setName(String name) {
        try {
            if(name == null || name.isBlank())
                throw new IllegalArgumentException("Name should not be blank");
            this.name = name;
        } catch(IllegalArgumentException ex) {
            LOGGER.error(ex.getMessage());
        }
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
        Resolution newResolution = rector.CreateResolution();
        resolutions.add(newResolution);
    }

    public String toString() {
        String info = "University " + name + "\nRector: " + rector.toString() + "\nFaculties:";
        for(Faculty faculty: faculties)
            info += "\n" + faculty;
        return info;
    }
}
