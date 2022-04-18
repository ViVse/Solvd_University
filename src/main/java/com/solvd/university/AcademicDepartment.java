package com.solvd.university;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AcademicDepartment {

    private static final Logger LOGGER = LogManager.getLogger(Teacher.class);
    private String name;
    private ArrayList<Group> groups = new ArrayList<Group>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public  AcademicDepartment() {}

    public AcademicDepartment(String name, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        this.name = name;
        this.groups = groups;
        this.teachers = teachers;
    }

    public void addGroup(Group newGroup) {
        groups.add(newGroup);
    }

    public void addTeacher(Teacher newTeacher) {
        teachers.add(newTeacher);
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

    public ArrayList<Group> getGroups() { return groups; }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public abstract void CreateCurriculum();

    public String toString() {
        String info = "Academic Department " + name + "\nGroups:";
        for(Group group : groups)
            info += "\n" + group.toString();
        info += "\nTeachers:";
        for(Teacher teacher : teachers)
            info += "\n" + teacher.toString();
        return info;
    }
}
