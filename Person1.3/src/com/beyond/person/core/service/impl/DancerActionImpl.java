package com.beyond.person.core.service.impl;

import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.interfaces.DancerAction;

public class DancerActionImpl implements DancerAction {
    Dancer dancer;

    public DancerActionImpl(String name, String surname, String designation, String groupName) throws InvalidFieldException {
        dancer = new Dancer(name, surname, designation, groupName);
    }

    @Override
    public void dancing() {
        System.out.println(dancer.getName() + " is a dancer at " + dancer.getGroupName());
        System.out.println(dancer.getName() + " dances only after eating");
    }

    @Override
    public void learn() {
        System.out.println(dancer.getName() + " has studied at State Dance Ensemble of Armenia");
    }

    @Override
    public void walk() {
        System.out.println(dancer.getName() + " walks 6km to get home");
    }

    @Override
    public void eat() {
        System.out.println(dancer.getName() + " eats only 3 times, not more");
    }

    @Override
    public void all() {
        dancing();
        learn();
        walk();
        eat();
    }
}