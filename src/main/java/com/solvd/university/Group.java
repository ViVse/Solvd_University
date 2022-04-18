package com.solvd.university;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.solvd.university.Documents.Schedule;

public class Group {

    private int number;
    private Curator curator;
    private GroupPresident president;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Schedule schedule;

    public Group() {}

    public Group(int number, Curator curator, GroupPresident president, Schedule schedule, ArrayList<Student> students) {
        this.number = number;
        this.curator = curator;
        this.president = president;
        this.schedule = schedule;
        this.students = students;
    }

    public void setGroupNumber(int number) {
        this.number = number;
    }

    public int getGroupNumber() {
        return number;
    }

    public Curator getCurator() {
        return curator;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public GroupPresident getGroupPresident() {
        return president;
    }

    public void setGroupPresident(GroupPresident president) {
        this.president = president;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void getPresidentReport() {
        president.giveReport(students);
    }

    public String toString() {
        final StringBuilder info = new StringBuilder("Group: " + number + "\n"
                + curator.toString() + "\n"
                + president.toString()
                + "\nStudents:");
        Stream.of(students).forEach(student -> info.append("\n").append(student.toString()));
        info.append("\n").append(schedule.toString());
        return info.toString();
    }
}
