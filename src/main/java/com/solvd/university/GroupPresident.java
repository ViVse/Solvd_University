package com.solvd.university;

import java.util.ArrayList;

import com.solvd.university.Interfaces.ICountStudentsFunction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class GroupPresident extends Student {

    private static final Logger LOGGER = LogManager.getLogger(GroupPresident.class);

    public GroupPresident() {}

    public GroupPresident(String name, String surname, int age, ArrayList<Integer> marks) {
        super(name, surname, age, marks);
    }

    public void giveReport(ArrayList<Student> students) {
        LOGGER.info("Reporting\n " + countAbsentStudents(students) + "students are absent.");
    }

    public void fillJournal() {
        LOGGER.info("Filled the journal");
    }

    private int countAbsentStudents(ArrayList<Student> students) {
        ICountStudentsFunction countAbsent = allStudents -> {
            int number = 0;
            for(Student student: students) {
                if(!student.getPresence()) number++;
            }
            return number;
        };

        return countAbsent.count(students);
    }

    public String toString() {
        return "Group president: " + super.toString();
    }
}
