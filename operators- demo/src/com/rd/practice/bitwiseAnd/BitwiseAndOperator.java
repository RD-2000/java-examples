package com.rd.practice.BitwiseAnd;

import java.util.Scanner;

public class BitwiseAndOperator {

    static  int firstNumber;
    static  int secondNumber;
    private static void bitwiseAndOperator(){
        int result = firstNumber & secondNumber;
        System.out.println("bitwise and operator " + result);
    }
    public static void main(String[] args) {
        System.out.println("please enter 2 value");
        Scanner scanner= new Scanner(System.in);
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        bitwiseAndOperator();
    }
}



