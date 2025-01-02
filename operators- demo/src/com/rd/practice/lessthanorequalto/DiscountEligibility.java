package com.rd.practice.lessthanoreqalto;
import java.util.Scanner;

    public class DiscountEligibility {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double DISCOUNT_AMOUNT = 05.0;
            double LOWER_LIMIT = 50.0;
            double UPPER_LIMIT = 500.0;

            System.out.print("Enter total purchase amount: ");
            double totalPurchase = Double.parseDouble(scanner.nextLine());

            if (!(totalPurchase < LOWER_LIMIT) && totalPurchase <= UPPER_LIMIT) {
                System.out.println("Congratulations! You are eligible for a " + DISCOUNT_AMOUNT + "% discount.");
            } else {
                System.out.println("Sorry, you are not eligible for a discount.");
            }

        }
    }



