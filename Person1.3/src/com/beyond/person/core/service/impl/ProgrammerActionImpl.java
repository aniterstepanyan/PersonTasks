package com.beyond.person.core.service.impl;

import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.interfaces.ProgrammerAction;

public class ProgrammerActionImpl implements ProgrammerAction {
    Programmer programmer;

    public ProgrammerActionImpl(String name, String surname, String designation, String companyName) throws InvalidFieldException {
        programmer = new Programmer(name, surname, designation, companyName);
    }

    @Override
    public void coding() {
        System.out.println(programmer.getName() + " is a junior programmer at " + programmer.getCompanyName());
        System.out.println(programmer.getName() + " codes after learning");
    }

    @Override
    public void learn() {
        System.out.println(programmer.getName() + " studies at Beyond Learning Hub");
    }

    @Override
    public void walk() {
        System.out.println(programmer.getName() + " walks 3km everyday to get home");
    }

    @Override
    public void eat() {
        System.out.println(programmer.getName() + " eats once a day, because she is a programmer she has no life");
    }

    @Override
    public void all() {
        coding();
        learn();
        walk();
        eat();
    }
}
