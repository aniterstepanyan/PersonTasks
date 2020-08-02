package com.beyond.person.core.model;

public class Person {
    protected String name;
    protected String designation;

    /**
     * Constructor for Person
     * */
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
}