package com.solvd.university;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Faculty {

    private static final Logger LOGGER = LogManager.getLogger(Faculty.class);
    String name;
    ArrayList<AcademicDepartment> departments = new ArrayList<AcademicDepartment>();

    public Faculty() {

    }

    public Faculty(String name, ArrayList<AcademicDepartment> departments) {
        this.name = name;
        this.departments = departments;
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

    public ArrayList<AcademicDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<AcademicDepartment> departments) {
        this.departments = departments;
    }

    public void addDepartment(AcademicDepartment newDepartment) {
        departments.add(newDepartment);
    }

    public String toString() {
        String info = "Faculty " + name + "\nAcademic departments:";
        for(AcademicDepartment department: departments)
            info += "\n" + department.toString();
        return info;
    }
}
