package com.beyond.person.core.model;

public class Dancer extends Person {
    private String groupName;

    /**
     * Constructor for Dancer
     * */
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public String getGroupName(){
        return groupName;
    }
}