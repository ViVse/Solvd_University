package com.solvd.university;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Curator extends Teacher{

    private static final Logger LOGGER = LogManager.getLogger(Curator.class);

    public Curator() {}

    public Curator(String name, String surname, int age, String subject) {
        super(name, surname, age, subject);
    }

    public void curate() {
        LOGGER.info("Curating");
    }

    public String toString() {
        return "Curator: " + super.toString();
    }
}
