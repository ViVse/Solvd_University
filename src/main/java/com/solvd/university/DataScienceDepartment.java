package com.solvd.university;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataScienceDepartment extends AcademicDepartment {

    private static final Logger LOGGER = LogManager.getLogger(DataScienceDepartment.class);

    public DataScienceDepartment() {
    }

    public DataScienceDepartment(String name, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        super(name, groups, teachers);
    }

    @Override
    public void CreateCurriculum() {
        LOGGER.info("Created Data Science Curriculum");
    }
}
