package com.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student [] s = new Student[n];
        Course [] c = new Course[n];

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int id = in.nextInt();
            String Cname = in.next();
            int cid = in.nextInt();
            s[i] = new Student();
            c[i] = new Course();
            c[i].setcd(cid, Cname);
            s[i].setdetails(id, name);
        }

        for (int i = 0; i < n; i++) {
            s[i].display();
            c[i].display();
        }
    }
}

