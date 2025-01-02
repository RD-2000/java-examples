package com.rd.practice.greaterthanorequalto;
import java.util.Scanner;

public class PromotionCheck {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final int Min_Tenure_for_promotion = 5;

            System.out.print("Enter the employee's tenure (in years): ");
            int tenure = scanner.nextInt();

            if (tenure >= Min_Tenure_for_promotion) {
                System.out.println("Congratulations! The employee is eligible for promotion.");
            } else {
                System.out.println("The employee is not eligible for promotion.");
            }

        }
    }



