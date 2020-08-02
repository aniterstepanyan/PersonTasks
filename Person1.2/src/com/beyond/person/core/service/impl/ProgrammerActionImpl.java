package com.beyond.person.core.service.impl;

import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.interfaces.ProgrammerAction;

public class ProgrammerActionImpl implements ProgrammerAction {
    Programmer programmer;

    /**
     * Constructor for Programmer impl
     * */
    public ProgrammerActionImpl(String name, String designation, String companyName){
        programmer = new Programmer(name, designation, companyName);
    }
    @Override
    public void coding(){
        System.out.println(programmer.getName() + " is a junior programmer at " + programmer.getCompanyName());
    }
    @Override
    public void learn(){
        System.out.println(programmer.getName() + " studies at Beyond Learning Hub");
    }
    @Override
    public void walk(){
        System.out.println(programmer.getName() + " walks 3km everyday to get home");
    }
    @Override
    public void eat(){
        System.out.println(programmer.getName() + " eats once a day, because she is a programmer she has no life");
    }

    /**
     * Programmer all methods
     * */
    @Override
    public void all(){
        coding();
        learn();
        walk();
        eat();
        System.out.println("----------------------");
    }
}
