package com.rd.prcatice.lessthan;

import java.util.Scanner;

public class AgeRestriction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the age");
        int no =Integer.parseInt(scanner.nextLine());

        if (no<18){
            System.out.println("user is too young  access specific content");


        }else
        {
            System.out.println("user is applicable too access specific content");
        }



    }
}
