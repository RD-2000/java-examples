package com.rd.practice.greaterthan;

import java.util.Scanner;

public class AttendenceCheck {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the participants attending the event");
        int participants = Integer.parseInt(scanner.nextLine());

        int currentCapacity =500;
        if (participants>currentCapacity) {
                System.out.println("Alert! The number of participants exceeds the event capacity.");
            } else {
                System.out.println("The number of participants is within the allowed capacity.");
            }
        }
        }




