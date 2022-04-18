package com.solvd.university;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ComputingDepartment extends AcademicDepartment {

    private static final Logger LOGGER = LogManager.getLogger(ComputingDepartment.class);

    public ComputingDepartment() {
    }

    public ComputingDepartment(String name, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        super(name, groups, teachers);
    }

    @Override
    public void CreateCurriculum() {
        LOGGER.info("Created Math Curriculum");
    }
}
