package com.rd.practice.BitwiseOr;

import java.util.Scanner;

public class BitwiseOrOperator {
    static  int firstNumber=0;
    static  int secondNumber=0;
    private static void bitwiseOrOperator(){
        int result = firstNumber | secondNumber;
        System.out.println("bitwise or operator " + result);
    }
    public static void main(String[] args) {
        System.out.println("please enter 2 value");
        Scanner scanner= new Scanner(System.in);
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        bitwiseOrOperator();
    }
}
