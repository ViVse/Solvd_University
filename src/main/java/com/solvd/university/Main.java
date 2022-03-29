package com.solvd.university;

import com.solvd.university.Documents.Lecture;
import com.solvd.university.Documents.Schedule;
import com.solvd.university.Enums.DayOfTheWeek;

public class Main {
    public static void main(String[] args) {

        Schedule schedule = new Schedule();

        schedule.addLecture(DayOfTheWeek.MON, new Lecture("test", "test", "test"));
        schedule.addLecture(DayOfTheWeek.MON, new Lecture("test1", "test1", "test1"));
        schedule.addLecture(DayOfTheWeek.THU, new Lecture("test", "test", "test"));

        System.out.println(schedule);
    }
}
