package com.rd.practice.notEqualTo;

public class DeviceStatusCheck {
        public static void main(String[] args) {
            String deviceStatus = "offline";

            if (!deviceStatus.equals("online")) {
                System.out.println("Notification: The device is NOT online.");
            } else {
                System.out.println("The device is online.");
            }
        }
    }


