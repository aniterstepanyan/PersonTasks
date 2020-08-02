package com.beyond.person.core.service.impl;

import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.interfaces.SingerAction;

public class SingerActionImpl implements SingerAction {
    Singer singer;

    /**
     * Constructor for Singer impl
     * */
    public SingerActionImpl(String name, String designation, String bandName){
        singer = new Singer(name, designation, bandName);
    }
    @Override
    public void singing() {
        System.out.println(singer.getName() + " is a singer at " + singer.getBandName());
    }
    @Override
    public void playGuitar() {
        System.out.println(singer.getName() + " is playing guitar, when he is bored of everyone");
    }
    @Override
    public void learn(){
        System.out.println(singer.getName() + " studies at Jazz College");
    }
    @Override
    public void walk(){
        System.out.println(singer.getName() + " walks 8km to get home");
    }
    @Override
    public void eat(){
        System.out.println(singer.getName() + " eats four times a day");
    }

    /**
     * Singer all methods
     * */
    @Override
    public void all(){
        singing();
        playGuitar();
        learn();
        walk();
        eat();
        System.out.println("----------------------");
    }
}
