package com.beyond.person.core.service.impl;

import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.interfaces.SingerAction;

public class SingerActionImpl implements SingerAction {
    Singer singer;

    public SingerActionImpl(String name, String surname, String designation, String bandName) throws InvalidFieldException {
        singer = new Singer(name, surname, designation, bandName);
    }

    @Override
    public void singing() {
        System.out.println(singer.getName() + " is a singer at " + singer.getBandName());
        System.out.println("Can only sing after eating");
    }

    @Override
    public void learn() {
        System.out.println(singer.getName() + " studies at Jazz College");
    }

    @Override
    public void walk() {
        System.out.println(singer.getName() + " walks 8km to get home");
    }

    @Override
    public void eat() {
        System.out.println(singer.getName() + " eats 3 times a day");
    }

    @Override
    public void all() {
        singing();
        learn();
        walk();
        eat();
    }
}