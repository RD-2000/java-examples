package com.rd.practice.EqualTo;

import java.util.Scanner;

public class Authntication {
    public static void main(String[] args) {
        String storedUsername = "User";
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your username");
        String enteredUsername= scanner.nextLine();

        if( storedUsername.equals(enteredUsername)){
            System.out.println("Authentication sucessfull");
        }
        else {
            System.out.println("Authentication failed");
        }

    }

}
