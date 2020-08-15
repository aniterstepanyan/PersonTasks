package com.beyond.person.core.service.impl;

import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.model.Teacher;
import com.beyond.person.core.service.interfaces.TeacherAction;

public class TeacherActionImpl implements TeacherAction {
    Teacher teacher;

    public TeacherActionImpl(String name, String surname, String designation, String schoolName) throws InvalidFieldException {
        teacher = new Teacher(name, surname, designation, schoolName);
    }

    @Override
    public void teaching() {
        System.out.println(teacher.getName() + " works at " + teacher.getSchoolName());
        System.out.println(teacher.getName() + " teaches after learning");
    }

    @Override
    public void learn() {
        System.out.println(teacher.getName() + " has studied at ESU");
    }

    @Override
    public void walk() {
        System.out.println(teacher.getName() + " walks 1km to get home");
    }

    @Override
    public void eat() {
        System.out.println(teacher.getName() + " eats 4 times");
    }

    @Override
    public void all() {
        teaching();
        learn();
        walk();
        eat();
    }
}
