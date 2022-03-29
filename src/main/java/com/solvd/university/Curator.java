package com.solvd.university;

public final class Curator extends Teacher{

    public Curator() {}

    public Curator(String name, String surname, int age, String subject) {
        super(name, surname, age, subject);
    }

    public void curate() {
        System.out.println("Curating");
    }

    public String toString() {
        return "Curator: " + super.toString();
    }
}
