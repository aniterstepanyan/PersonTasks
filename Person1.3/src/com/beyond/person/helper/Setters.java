package com.beyond.person.helper;

import com.beyond.person.core.exceptions.*;
import com.beyond.person.core.model.Person;

public class Setters {
    public void setPerson(String name, String surname,String designation, String email, String gender, String nickname, int age) throws InvalidFieldException{
        Person person = new Person(name, surname);

        try {
            person.setName(name);
            person.setSurname(surname);
            person.setDesignation(designation);
            person.setEmail(email);
            person.setGender(gender);
            person.setNickname(nickname);
            person.setAge(age);
        }catch (InvalidFieldException | InvalidEmailException | InvalidGenderException | InvalidAgeException | InvalidTypeException exception){
            System.out.println(exception.getMessage());
        }
    }
}
