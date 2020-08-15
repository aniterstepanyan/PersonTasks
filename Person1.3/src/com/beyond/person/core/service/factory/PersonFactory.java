package com.beyond.person.core.service.factory;

import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.model.*;
import com.beyond.person.core.service.impl.*;
import com.beyond.person.core.service.interfaces.PersonAction;

public class PersonFactory {
    public static PersonAction getPersonType(Person person) throws InvalidFieldException {
        if (person instanceof Dancer){
            Dancer dancer = (Dancer)person;
            return new DancerActionImpl(dancer.getName(), dancer.getSurname(), dancer.getDesignation(), dancer.getGroupName());
        }

        else if (person instanceof Programmer){
            Programmer programmer = (Programmer)person;
            return new ProgrammerActionImpl(programmer.getName(), programmer.getSurname(), programmer.getDesignation(), programmer.getCompanyName());
        }

        else if (person instanceof Driver){
            Driver driver = (Driver)person;
            return new DriverActionImpl(driver.getName(),driver.getSurname(), driver.getDesignation(), driver.getOfficeName());
        }

        else if (person instanceof Singer){
            Singer singer = (Singer)person;
            return new SingerActionImpl(singer.getName(), singer.getSurname(), singer.getDesignation(), singer.getBandName());
        }

        else if (person instanceof Teacher){
            Teacher teacher = (Teacher)person;
            return new TeacherActionImpl(teacher.getName(), teacher.getSurname(), teacher.getDesignation(), teacher.getSchoolName());
        }
        return null;
    }
}
