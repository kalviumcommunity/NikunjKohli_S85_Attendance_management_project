package com.school;

public class Student {
    int id;
    String name;

    public void setdetails(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("Student ID: " + this.id + ", Name: " + this.name);
    }
}

