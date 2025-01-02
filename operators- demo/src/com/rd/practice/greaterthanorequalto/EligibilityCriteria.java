package com.rd.practice.greaterthanorequalto;
import java.util.Scanner;

public class EligibilityCriteria {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            final int min_marks_for_scholership = 75;

            System.out.print("Enter the student's marks (out of 100): ");
            int marks = scanner.nextInt();

            if (marks >= min_marks_for_scholership) {
                System.out.println("Congratulations! The student qualifies for the scholarship.");
            } else {
                System.out.println("Sorry, the student does not qualify for the scholarship.");
            }
        }
    }

