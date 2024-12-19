package com.rd.practice.accessspecifires.model;

public class PublicStudent {
    public int id;
    public String name;
    public String city;

    @Override
    public String toString() {
        return "PublicStudent{" +
                "city='" + city + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
