package com.rd.practice.model;

public class Person {
   public  String firstName;
    public String lastName;
    public int age;



    @Override
    public String toString(){
        return "Person{" +
            "firstName= ' " + firstName + '\'' +
            " ,lastName='" + lastName +'\''+
              ",age='" +age +'\''+

        '}';
    }

}
