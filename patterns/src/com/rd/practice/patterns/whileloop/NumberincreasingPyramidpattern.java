package com.rd.practice.patterns.whileloop;


public class NumberincreasingPyramidpattern {

    //psuedo code
    //1
    //1 2
    // 1 2 3
    //1 2 3 4
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            int j=1;
            while(j<=i){
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}





