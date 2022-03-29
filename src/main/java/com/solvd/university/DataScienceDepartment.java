package com.solvd.university;

import java.util.ArrayList;

public class DataScienceDepartment extends AcademicDepartment {

    public DataScienceDepartment() {
    }

    public DataScienceDepartment(String name, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        super(name, groups, teachers);
    }

    @Override
    public void CreateCurriculum() {
        System.out.println("Created Data Science Curriculum");
    }
}
