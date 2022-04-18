package com.solvd.university.Interfaces;

import com.solvd.university.Student;

import java.util.List;

@FunctionalInterface
public interface ICountStudentsFunction {

    int count(List<Student> students);
}
