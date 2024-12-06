package com.rd.prcatice.lessthan;

import java.util.Scanner;

public class StockMonitoring {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter current inventory count");
        int inventory =Integer.parseInt(scanner.nextLine());
        int minimumthreshold=50;

        if(inventory<minimumthreshold){
            System.out.println("Alert inventory is below the minimum threshold");
        }
        else
        {
            System.out.println(" invetory is sufficient");
        }





    }
}
