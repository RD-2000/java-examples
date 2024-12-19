package com.rd.practice.patterns.whileloop;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        int rows = 5;

        int i = 1;
        while (i <= rows) {
            int space = rows - i;
            while (space > 0) {
                System.out.print(" ");
                space--;

            }
            int stars = 1;
            while (stars <= i) {
                System.out.print("* ");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}
