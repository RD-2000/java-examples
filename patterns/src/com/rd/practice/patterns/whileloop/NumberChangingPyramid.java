package com.rd.practice.patterns.whileloop;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        int rows=4;
        int num=1;

        int i=1;
        while (i<=rows){
            int j=1;
            while(j<=i){
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();
            i++;

        }

    }
}
