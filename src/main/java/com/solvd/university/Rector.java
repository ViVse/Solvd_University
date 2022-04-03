package com.solvd.university;

import java.util.Random;

import com.solvd.university.Documents.Resolution;
import com.solvd.university.Interfaces.IAdministrate;

public final class Rector extends Human implements IAdministrate {

    public Rector() {}

    public Rector(String name, String surname, int age) {
        super(name, surname, age, null, null);
    }

    @Override
    public Resolution CreateResolution() {
        Random random = new Random();
        String name = "Documents.Resolution #" + random.nextInt(1000);
        String text = "Sample text";
        return new Resolution(name, text);
    }

    @Override
    public void MakeSpeech() {
        System.out.println("Delivering a speech");
    }
}
