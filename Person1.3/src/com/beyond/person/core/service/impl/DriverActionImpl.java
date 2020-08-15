package com.beyond.person.core.service.impl;

import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.model.Driver;
import com.beyond.person.core.service.interfaces.DriverAction;

public class DriverActionImpl implements DriverAction {
    Driver driver;

    public DriverActionImpl(String name, String surname, String designation, String officeName) throws InvalidFieldException {
        driver = new Driver(name, surname, designation, officeName);
    }

    @Override
    public void driving() {
        System.out.println(driver.getName() + " works for " + driver.getOfficeName());
        System.out.println(driver.getName() + " drives after eating");
    }

    @Override
    public void learn() {
        System.out.println(driver.getName() + " has studied at GTA Vice City");
    }

    @Override
    public void walk() {
        System.out.println(driver.getName() + " doesn't walk because " + driver.getName() + " has only one foot");
    }

    @Override
    public void eat() {
        System.out.println(driver.getName() + " eats only twice a day");
    }

    @Override
    public void all() {
        driving();
        learn();
        walk();
        eat();
    }
}
