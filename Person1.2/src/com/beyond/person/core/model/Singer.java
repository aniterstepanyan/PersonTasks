package com.beyond.person.core.model;

public class Singer extends Person {
    private String bandName;

    /**
     * Constructor for Singer
     * */
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public String getBandName(){
        return bandName;
    }
}