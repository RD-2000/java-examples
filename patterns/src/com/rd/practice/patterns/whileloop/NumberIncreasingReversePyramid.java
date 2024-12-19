package com.rd.practice.patterns.whileloop;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        int rows=4;
        int i=rows;
        while (i>=1){
            int j=1;
            while(j<=i){
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
