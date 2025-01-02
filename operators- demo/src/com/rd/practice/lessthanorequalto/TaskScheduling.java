package com.rd.practice.lessthanoreqalto;

import java.util.Scanner;
import java.time.LocalDate;

public class TaskScheduling {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

                // Get the current date
                LocalDate currentDate = LocalDate.now();

                System.out.print("Enter the deadline for the task (dd-mm-yyyy): ");

        String deadlineInput = scanner.nextLine();
        LocalDate deadline = LocalDate.parse(deadlineInput);

                if (deadline.compareTo(currentDate) <= 0) {
                    System.out.println("Task is scheduled as its deadline is on or before " + currentDate + ".");
                } else {
                    System.out.println("Task cannot be scheduled as its deadline is after " + currentDate + ".");
                }

            }
        }
