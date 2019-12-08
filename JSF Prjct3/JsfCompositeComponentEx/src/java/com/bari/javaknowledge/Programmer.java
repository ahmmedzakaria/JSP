package com.bari.javaknowledge;

public class Programmer {

    private String firstName, lastName, level;
    private String[] languages;

    public Programmer(String firstName,
            String lastName,
            String level,
            String... languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
        this.languages = languages;
    }

    public String getFirstName() {
        return firstName;
    }

    public String[] getLanguages() {
        return languages;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLevel() {
        return level;
    }    
}
