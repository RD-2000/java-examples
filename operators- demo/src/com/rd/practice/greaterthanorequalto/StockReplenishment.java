package com.rd.practice.greaterthanorequalto;
import java.util.Scanner;

public class StockReplenishment {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           int Reorder_Level = 50;

            System.out.print("Enter the current inventory level: ");
            int inventoryLevel = scanner.nextInt();

            if (inventoryLevel >= Reorder_Level) {
                System.out.println("Inventory is above or at the reorder level.");
            } else {
                System.out.println("Inventory is below the reorder level.");
            }
        }
    }



