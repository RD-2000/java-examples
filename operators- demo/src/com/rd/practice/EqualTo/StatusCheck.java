package com.rd.practice.EqualTo;

import java.util.Scanner;

public class StatusCheck {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String systemState = "ready";
        if (systemState == "ready"){
            System.out.println("the system is ready check");
        }
        else {
            System.out.println("the system is not in the ready state");
        }
    }
}
