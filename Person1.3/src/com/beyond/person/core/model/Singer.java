package com.beyond.person.core.model;

import com.beyond.person.core.enums.SingerType;
import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.exceptions.InvalidTypeException;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String surname, String designation, String bandName) throws InvalidFieldException{
        super(name, surname);
        this.bandName = bandName;
        this.designation = designation;
    }

    @Override
    public void setDesignation(String designation) throws InvalidTypeException {
        if (designation.equals(SingerType.JAZZ) && designation.equals(SingerType.HIP_HOP) && designation.equals(SingerType.ROCK))
            this.designation = designation;
        else throw new InvalidTypeException("Invalid designation");
    }

    public String getBandName() {
        return bandName;
    }
}
