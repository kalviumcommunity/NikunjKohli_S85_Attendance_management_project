package com.school;

public class Course {
    int id;
    String name;

    public void setcd(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Course ID: " + this.id + ", Name: " + this.name);
    }
}
