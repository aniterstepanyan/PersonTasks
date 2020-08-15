package com.beyond.person.helper;

import com.beyond.person.core.exceptions.InvalidFieldException;
import com.beyond.person.core.exceptions.InvalidTypeException;
import com.beyond.person.core.model.*;
import com.beyond.person.core.service.factory.PersonFactory;
import com.beyond.person.core.service.impl.*;

import java.util.Scanner;

public class Input {
    public void Input(int choice, String name, String surname, String designation) throws InvalidFieldException, InvalidTypeException {
        Scanner sc = new Scanner(System.in);
        if (choice == 1){
            System.out.println("What group does the dancer dance in ");
            String groupName = sc.nextLine();
            try {
                Person dancer = new Dancer(name, surname, designation, groupName);
                dancer.setDesignation(designation);
                DancerActionImpl dancerPerson = (DancerActionImpl) PersonFactory.getPersonType(dancer);
                dancerPerson.all();
            } catch (InvalidTypeException exception){
                System.out.println(exception.getMessage());
            }
        }

        else if (choice == 2){
            System.out.println("What band does the singer sing in ");
            String bandName = sc.nextLine();
            try {
                Person singer = new Singer(name, surname, designation, bandName);
                singer.setDesignation(designation);
                SingerActionImpl singerPerson = (SingerActionImpl) PersonFactory.getPersonType(singer);
                singerPerson.all();
            }catch (InvalidTypeException exception){
                System.out.println(exception.getMessage());
            }
        }

        else if (choice == 3){
            System.out.println("Where programmer works");
            String companyName = sc.nextLine();
            try {
                Person programmer = new Programmer(name, surname, designation, companyName);
                programmer.setDesignation(designation);
                ProgrammerActionImpl programmerPerson = (ProgrammerActionImpl) PersonFactory.getPersonType(programmer);
                programmerPerson.all();
            }catch (InvalidTypeException exception){
                System.out.println(exception.getMessage());
            }
        }

        else if (choice == 4){
            System.out.println("Where driver works");
            String officeName = sc.nextLine();
            try {
                Person driver = new Driver(name, surname, designation, officeName);
                driver.setDesignation(designation);
                DriverActionImpl driverPerson = (DriverActionImpl) PersonFactory.getPersonType(driver);
                driverPerson.all();
            }catch (InvalidTypeException exception){
                System.out.println(exception.getMessage());
            }
        }

        else if (choice == 5){
            System.out.println("Where teacher is teaching");
            String schoolName = sc.nextLine();
            try {
                Person teacher = new Teacher(name, surname, designation, schoolName);
                teacher.setDesignation(designation);
                TeacherActionImpl teacherPerson = (TeacherActionImpl) PersonFactory.getPersonType(teacher);
                teacherPerson.all();
            }catch (InvalidTypeException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
