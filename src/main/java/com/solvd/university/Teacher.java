package com.solvd.university;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.university.Documents.Lecture;
import com.solvd.university.Exceptions.TeacherException;
import com.solvd.university.Interfaces.ITeach;

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
            if(StringUtils.isAllBlank(subject))
                throw new TeacherException("Subject should not be blank");
            this.subject = subject;
        } catch(TeacherException ex) {
            LOGGER.error(ex.getMessage());
        }
    }

    public void giveMark(Student student) {
        int mark = RandomUtils.nextInt(1, 6);
        student.addMark(mark);
    }

    @Override
    public final Lecture PrepareLecture() {
        Lecture newLecture = new Lecture(subject, "Random theme", "Some info");
        return newLecture;
    }

    @Override
    public final void GiveLecture() {
        LOGGER.info("Giving lectures about " + subject);
    }

    public String toString() {
        return super.toString() + ", subject: " + subject;
    }
}
