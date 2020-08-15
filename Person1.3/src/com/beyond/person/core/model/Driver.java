package com.beyond.person.core.model;

import com.beyond.person.core.enums.DriverType;
import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.exceptions.InvalidTypeException;

public class Driver extends Person{
    private final String officeName;

    public Driver(String name, String surname, String designation, String officeName) throws InvalidFieldException{
        super(name, surname);
        this.officeName = officeName;
        this.designation = designation;
    }

    @Override
    public void setDesignation(String designation) throws InvalidTypeException {
        if (designation.equals(DriverType.BUS) && designation.equals(DriverType.METRO) && designation.equals(DriverType.TAXI))
            this.designation = designation;
        else throw new InvalidTypeException("Invalid designation");
    }

    public String getOfficeName() {
        return officeName;
    }
}
