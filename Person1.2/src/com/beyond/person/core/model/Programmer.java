package com.beyond.person.core.model;

public class Programmer extends Person {
    private String companyName;

    /**
     * Constructor for Programmer
     * */
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public String getCompanyName(){
        return companyName;

    }
}