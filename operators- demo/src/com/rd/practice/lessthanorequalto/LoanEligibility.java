package com.rd.practice.lessthanoreqalto;
import java.util.Scanner;

    public class LoanEligibility {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


             int MAX_ELIGIBLE_AGE = 60;


            System.out.print("Enter the applicant's age: ");
            int age = Integer.parseInt(scanner.nextLine());

            if (age <= MAX_ELIGIBLE_AGE) {
                System.out.println("Congratulations! The loan is approved.");
            } else {
                System.out.println("Sorry, the loan cannot be approved as the applicant exceeds the eligible age.");
            }

        }
    }



