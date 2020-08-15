package com.beyond.person.enterypoint;

import com.beyond.person.core.exceptions.*;
import com.beyond.person.helper.Input;
import com.beyond.person.helper.Setters;

import java.util.Scanner;

public class Main {
    /**
     * Code is not finished yet, there are some exceptions that don't work
     * */
    public static void main(String[] args) throws InvalidFieldException, InvalidTypeException {
        int count = 0;
        String input = "";
        Scanner scan = new Scanner(System.in);

        while (count < 3) {
            System.out.println("What type of person you want to create 1 - dancer , 2 - singer , 3 - programmer , 4 - driver , 5 - teacher");
            System.out.println("|Choose 6 for exit|");
            input = scan.next();

            try {
                if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")) {
                    int choice = Integer.parseInt(input);
                    System.out.println("Name: ");
                    String name = scan.next();

                    System.out.println("Surname: ");
                    String surname = scan.next();

                    System.out.println("Designation: ");
                    String designation = scan.next();

                    System.out.println("Gender: ");
                    String gender = scan.next();

                    System.out.println("Email: ");
                    String email = scan.next();

                    System.out.println("Nickname: ");
                    String nickname = scan.next();

                    System.out.println("Age: ");
                    int age = scan.nextInt();

                    Input input1 = new Input();
                    input1.Input(choice, name, surname, designation);

                    Setters setters = new Setters();
                    setters.setPerson(name, surname, designation, email, gender, nickname, age);


                } else if (input.equals("6")){
                    System.exit(0);
                }
                else {
                    throw new InvalidPersonException("Person not supported");
                }
            } catch (InvalidPersonException exception) {
                System.out.println(exception.getMessage());
                count++;

            }
        }
        System.exit(0);
    }
}
