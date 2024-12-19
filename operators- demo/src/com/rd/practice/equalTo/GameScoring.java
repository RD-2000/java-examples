package com.rd.practice.EqualTo;

import java.util.Scanner;

public class GameScoring {
    public static void main(String[] args) {
        int winnigTarget=100;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your score");
        int playScore=scanner.nextInt();

        if(playScore == winnigTarget) {
            System.out.println("Congratulations ! You have reached the winning target");
        }
        else {
            System.out.println("your score dosent match the winning target");



        }
    }
}
