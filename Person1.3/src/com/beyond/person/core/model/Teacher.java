package com.beyond.person.core.model;

import com.beyond.person.core.enums.TeacherType;
import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.exceptions.InvalidTypeException;

public class Teacher extends Person{
    private String schoolName;

    public Teacher(String name, String surname, String designation, String schoolName) throws InvalidFieldException{
        super(name, surname);
        this.schoolName = schoolName;
        this.designation = designation;
    }

    @Override
    public void setDesignation(String designation) throws InvalidTypeException {
        if (designation.equals(TeacherType.BIOLOGY) && designation.equals(TeacherType.HISTORY) && designation.equals(TeacherType.MATH))
            this.designation = designation;
        else throw new InvalidTypeException("Invalid exception");
    }

    public String getSchoolName() {
        return schoolName;
    }
}
