package com.beyond.person.core.service.factory;

import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Person;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.impl.DancerActionImpl;
import com.beyond.person.core.service.impl.ProgrammerActionImpl;
import com.beyond.person.core.service.impl.SingerActionImpl;
import com.beyond.person.core.service.interfaces.PersonAction;

public class PersonFactory {

    /**
     * Method for Person type generation
     * */
    public static PersonAction getPersonType(Person person){
        if (person instanceof Programmer){
            Programmer programmer = (Programmer)person;
            return new ProgrammerActionImpl(programmer.getName(), programmer.getDesignation(), programmer.getCompanyName());
        }
        else if (person instanceof Dancer){
            Dancer dancer = (Dancer)person;
            return new DancerActionImpl(dancer.getName(), dancer.getDesignation(), dancer.getGroupName());

        }
        else if (person instanceof Singer){
            Singer singer = (Singer)person;
            return new SingerActionImpl(singer.getName(), singer.getDesignation(), singer.getBandName());
        }
        return null;
    }
}
