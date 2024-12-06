package com.rd.prcatice.lessthan;

import java.util.Scanner;

public class SpeedViolation {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("enter vehicle speed");
            int vehicleSpeed =Integer.parseInt(scanner.nextLine());
            int minimumSpeedLimit = 60;

            if (vehicleSpeed < minimumSpeedLimit) {
                System.out.println("Speed violation! The vehicle is moving below the minimum speed limit.");
            } else {
                System.out.println("The vehicle's speed is within the acceptable range.");
            }
        }
    }


