package com.beyond.person.enterypoint;

import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Person;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.factory.PersonFactory;
import com.beyond.person.core.service.impl.DancerActionImpl;
import com.beyond.person.core.service.impl.ProgrammerActionImpl;
import com.beyond.person.core.service.impl.SingerActionImpl;

public class Main {
    public static void main(String[] args) {
        Person programmer = new Programmer("Maria", "programmer", "DISQO");
        Person dancer = new Dancer("Leonard", "dancer", "Todes");
        Person singer = new Singer("T-Fest", "singer", "Gazgolder");


        /**
         * Calling all methods
         * */
        ProgrammerActionImpl programmerPerson = (ProgrammerActionImpl) PersonFactory.getPersonType(programmer);
        programmerPerson.all();

        DancerActionImpl dancerPerson = (DancerActionImpl) PersonFactory.getPersonType(dancer);
        dancerPerson.all();

        SingerActionImpl singerPerson = (SingerActionImpl) PersonFactory.getPersonType(singer);
        singerPerson.all();
    }
}
