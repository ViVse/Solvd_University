package com.solvd.university;

import com.solvd.university.Documents.Lecture;
import com.solvd.university.Interfaces.ITeach;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Teacher extends Human implements ITeach {

    private static final Logger LOGGER = LogManager.getLogger(Teacher.class);
    private String subject;

    public  Teacher() {}

    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age, null, null);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        try {
            if(subject == null || subject.isBlank())
                throw new IllegalArgumentException("Subject should not be blank");
            this.subject = subject;
        } catch(IllegalArgumentException ex) {
            LOGGER.error(ex.getMessage());
        }
    }

    public void giveMark(Student student) {
        Random random = new Random();
        int mark = random.nextInt(5) + 1;
        student.addMark(mark);
    }

    @Override
    public final Lecture PrepareLecture() {
        Lecture newLecture = new Lecture(subject, "Random theme", "Some info");
        return newLecture;
    }

    @Override
    public final void GiveLecture() {
        System.out.println("Giving lectures about " + subject);
    }

    public String toString() {
        return super.toString() + ", subject: " + subject;
    }
}
