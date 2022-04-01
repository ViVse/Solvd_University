package com.solvd.university;

import com.solvd.university.Interfaces.IStudy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

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
                throw new IllegalArgumentException("Mark should be between 1 and 5");
            marks.add(mark);
        } catch(IllegalArgumentException ex) {
            LOGGER.error(ex.getMessage());
        }
    }

    @Override
    public final void Read() {
        System.out.println("Reading...");
    }

    @Override
    public final void MakeNotes() {
        System.out.println("Making notes...");
    }

    @Override
    public final void DoHomework() {
        System.out.println("Doing homework...");
    }

    public String toString() {
        return super.toString();
    }
}
