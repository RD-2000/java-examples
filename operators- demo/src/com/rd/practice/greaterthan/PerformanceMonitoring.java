package com.rd.practice.greaterthan;

import java.util.Scanner;

public class PerformanceMonitoring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("enter the cpuUsage in %");

        int cpuUsage = Integer.parseInt(scanner.nextLine());
        System.out.println("the cpuUsage is "+cpuUsage+"%");

        int cpuUsageThreshold = 80;
        if (cpuUsage > cpuUsageThreshold) {
            System.out.println("ALERT! CPU usage exceeds 80%. Current usage: " + cpuUsage + "%");
        } else {
            System.out.println("CPU usage is normal. Current usage: " + cpuUsage + "%");
        }
    }
}