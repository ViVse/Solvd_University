package com.solvd.university;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.university.Exceptions.StudentException;
import com.solvd.university.Interfaces.IStudy;

public class Student extends Human implements IStudy {

    private static final Logger LOGGER = LogManager.getLogger(Student.class);
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    private boolean presence;

    public Student() {}

    public Student(String name, String surname, int age, ArrayList<Integer> marks) {
        super(name, surname, age, null, null);
        this.marks = marks;
        presence = true;
    }

    public void goToLessons() {
        presence = true;
    }

    public void stayHome() {
        presence = false;
    }

    public boolean getPresence() {
        return  presence;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void addMark(int mark) {
        try {
            if(mark < 1 || mark > 5)
                throw new StudentException("Mark should be between 1 and 5");
            marks.add(mark);
        } catch(StudentException ex) {
            LOGGER.error(ex.getMessage());
        }
    }

    @Override
    public final void Read() {
        LOGGER.info("Reading...");
    }

    @Override
    public final void MakeNotes() {
        LOGGER.info("Making notes...");
    }

    @Override
    public final void DoHomework() {
        LOGGER.info("Doing homework...");
    }

    public String toString() {
        return super.toString();
    }
}
