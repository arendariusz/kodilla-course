package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //testowanie kalkulatora
        Calculator adding = new Calculator(5,5);
        if (adding.Add() == 10){
            System.out.println("Dodawanie działa poprawnie");
        } else {
            System.out.println("Dodawanie nie działa poprawnie");
        }

        if (adding.substract() == 0){
            System.out.println("Odejmowanie działa poprawnie");
        } else {
            System.out.println("Odejmowanie nie działa poprawnie");
        }
    }
}