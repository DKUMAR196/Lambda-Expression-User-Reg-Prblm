package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

interface FirstNameInterface {
    boolean firstNameValidation();
}

interface LastNameInterface {
    boolean lastNameValidation();
}

interface EmailValidationInterface {
    boolean emailValidation();
}

interface MobileValidationInterface {
    boolean phoneValidation();
}

interface PasswordValInterface {
    boolean passwordValidation();
}

public class UserRegistrationProblem {
    public static void main(String[] args) {

        System.out.println("Enter First Name :");
        FirstNameInterface Deepak = (() -> {
            Scanner scanner = new Scanner(System.in);
            String firstname = scanner.next();
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstname);
        });
        System.out.println(Deepak.firstNameValidation());

        System.out.println("Enter Last name :");
        LastNameInterface kumar = (() -> {
            Scanner scanner = new Scanner(System.in);
            String lastname = scanner.next();
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lastname);
        });
        System.out.println(kumar.lastNameValidation());

        System.out.println("Enter Email Address :");
        EmailValidationInterface person = (() -> {
            Scanner scanner = new Scanner(System.in);
            String email = scanner.next();
            return Pattern.matches("^[a-zA-Z0-9-.+]+@[a-zA-Z0-9.]+$", email);
        });
        System.out.println(person.emailValidation());

        System.out.println("Enter Phone Number :");
        MobileValidationInterface person1 = (() -> {
            Scanner scanner = new Scanner(System.in);
            String phoneNumber = scanner.next();
            return Pattern.matches("^[0-9]{3} [0-9]{10}$", phoneNumber);
        });
        System.out.println(person1.phoneValidation());

        System.out.println("Enter Password :");
        PasswordValInterface person2 = (() -> {
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            return Pattern.matches("(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", password);
        });
        System.out.println(person2.passwordValidation());
    }
}