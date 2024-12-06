package com.rd.practice.greaterthan;

import java.util.Scanner;

public class BankBalanceValidation {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the Withdrawal Amount");
        double withdrawalAmount = Double.parseDouble(scanner.nextLine());

        double currentBalance = 6000.00;
        if (withdrawalAmount > currentBalance) {
            System.out.println("Transaction declined: Withdrawal amount exceeds current balance.");
        } else {

            currentBalance -= withdrawalAmount;
            System.out.println("Transaction successful. Remaining balance: $" + currentBalance);
        }
    }
}
