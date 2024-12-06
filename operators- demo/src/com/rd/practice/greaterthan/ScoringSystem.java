package com.rd.practice.greaterthan;

import java.util.Scanner;

public class ScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Candidate Score");
        int candidateScore = Integer.parseInt(scanner.nextLine());

        int benchmarkScore = 75;

        if (candidateScore > benchmarkScore) {
            System.out.println("Congratulations! The candidate's score surpasses the benchmark.");
        } else {
            System.out.println("The candidate's score does not surpass the benchmark.");
        }
    }
}
