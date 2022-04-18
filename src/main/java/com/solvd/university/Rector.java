package com.solvd.university;

import java.util.Random;

import com.solvd.university.Documents.Resolution;
import com.solvd.university.Interfaces.IAdministrate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Rector extends Human implements IAdministrate {

    private static final Logger LOGGER = LogManager.getLogger(Rector.class);

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
        LOGGER.info("Delivering a speech");
    }

    @Override
    public String toString() {
        return  "Rector: " + super.toString();
    }
}
