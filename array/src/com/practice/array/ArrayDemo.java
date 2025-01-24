package com.practice.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=50;
        a[1]=60;
        a[2]=70;
        a[3]=70;
        a[4]=80;
        // a[6]=90;
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}

