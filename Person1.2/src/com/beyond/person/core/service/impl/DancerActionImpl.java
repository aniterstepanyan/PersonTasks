package com.beyond.person.core.service.impl;

import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.interfaces.DancerAction;

public class DancerActionImpl implements DancerAction {
    Dancer dancer;

    /**
     * Constructor for Dancer impl
     * */
    public DancerActionImpl(String name, String designation, String groupName){
        dancer = new Dancer(name, designation, groupName);
    }

    @Override
    public void dancing() {
        System.out.println(dancer.getName() + " is a dancer at " + dancer.getGroupName());
    }

    @Override
    public void learn(){
        System.out.println(dancer.getName() + " has studied at State Dance Ensemble of Armenia");
    }
    @Override
    public void walk(){
        System.out.println(dancer.getName() + " walks 6km to get home");

    }
    @Override
    public void eat(){
        System.out.println(dancer.getName() + " eats twice a day");
    }

    /**
     * Dancer all methods
     * */
    @Override
    public void all(){
        dancing();
        learn();
        walk();
        eat();
        System.out.println("----------------------");
    }
}