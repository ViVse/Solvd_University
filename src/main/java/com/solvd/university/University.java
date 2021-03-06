package com.solvd.university;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.university.Documents.Resolution;

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
            if(StringUtils.isAllBlank(name))
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
        final StringBuilder info =  new StringBuilder("University " + name + "\n" + rector.toString() + "\nFaculties:");
        Stream.of(faculties).forEach(faculty -> info.append("\n").append(faculty));
        return info.toString();
    }
}
