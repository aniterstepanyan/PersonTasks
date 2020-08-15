package com.beyond.person.core.model;

import com.beyond.person.core.enums.DancerType;
import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.exceptions.InvalidTypeException;


public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String surname, String designation, String groupName) throws InvalidFieldException{
        super(name, surname);
        this.groupName = groupName;
        this.designation = designation;
    }

    @Override
    public void setDesignation(String designation) throws InvalidTypeException {
        if (designation.equals(DancerType.LATINO) && designation.equals(DancerType.TRADITIONAL_ARMENIAN) && designation.equals(DancerType.CONTEMPORARY))
            this.designation = designation;
        else throw new InvalidTypeException("Invalid designation");
    }

    public String getGroupName() {
        return groupName;
    }
}