package com.rd.practice.patterns.whileloop;

import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
      System.out.print("number the rows of triangle");
      int rows = scanner.nextInt();
      int i=1;
      while (i<=rows){
          int j=1;
          while(j<=i){
              System.out.print(j + " ");
              j++;
          }
          System.out.println();
          i++;
      }
    }
}
