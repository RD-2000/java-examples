package com.rd.practice.notEqualTo;

import java.util.Scanner;

public class NotEqualsToOperatorDemo {
    //pseudocode
    //if (no is not equals to 100 or not)
    // ? print good number
    //print bad number
    public static void main(String[] args) {
        System.out.println("Enter the value..");
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();

        if(Integer.parseInt(input) !=100){
            System.out.println("non-matching - non century");
        }
        else{
            System.out.println("matching - century");
        }
    }
}
