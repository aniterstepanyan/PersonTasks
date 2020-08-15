package com.beyond.person.core.model;

import com.beyond.person.core.enums.ProgrammerType;
import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.exceptions.InvalidTypeException;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String surname, String designation, String companyName) throws InvalidFieldException{
        super(name, surname);
        this.companyName = companyName;
        this.designation = designation;
    }

    @Override
    public void setDesignation(String designation) throws InvalidTypeException{
        if (designation.equals(ProgrammerType.DATA_ENGINEER) && designation.equals(ProgrammerType.HARDWARE_ENGINEER) && designation.equals(ProgrammerType.SOFTWARE_ENGINEER))
            this.designation = designation;
        else throw new InvalidTypeException("Invalid designation");
    }

    public String getCompanyName() {
        return companyName;
    }
}
