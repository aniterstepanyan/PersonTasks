package com.beyond.person.core.model;

import com.beyond.person.core.exceptions.*;

public class Person {
    protected String name;
    protected String surname;
    protected String email;
    protected String gender;
    protected String nickname;
    protected String designation;
    protected int age;
    private final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public String getName() {
        return name;
    }
    public void setName(String name) throws InvalidFieldException{
        if (name.length() > 0 && name.length() < 255){
            this.name = name;
        } else throw  new InvalidFieldException("Invalid name");
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) throws InvalidFieldException{
        if (surname.length() > 0 && surname.length() < 255) {
            this.surname = surname;
        } else throw  new InvalidFieldException("Invalid surname");
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws InvalidAgeException{
        if (age > 0 && age < 100) {
            this.age = age;
        } else throw new InvalidAgeException("Invalid age");
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) throws InvalidEmailException{
        if (email.matches(emailRegex)) {
            this.email = email;
        } else throw new InvalidEmailException("Invalid email");
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) throws InvalidGenderException{
        if (gender.equals("Male") || gender.equals("Female")) {
            this.gender = gender;
        } else throw new InvalidGenderException("Invalid gender");
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) throws InvalidFieldException{
        if (nickname.length() > 0 && nickname.length() < 255) {
            this.nickname = nickname;
        } else throw new InvalidFieldException("Invalid nickname");
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) throws InvalidFieldException, InvalidTypeException {
        if (designation.length() > 0 && designation.length() < 255) {
            this.designation = designation;
        } else throw new InvalidFieldException("Invalid designation");
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
