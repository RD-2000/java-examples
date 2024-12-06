package com.rd.practice.service;

import com.rd.practice.model.Person;

import java.util.Scanner;

public class GovntSchemeDemoApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("plz enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("pls enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("pls  enter age");
        int age=Integer.parseInt(scanner.nextLine());


        Person person= new Person();
        person.firstName = firstName;
        person.lastName= lastName;
        person.age=age;

        System.out.println("person details recived in system:" +person);


    }
}
