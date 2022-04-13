package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    int id;
    String name;

    void setStudent() {
        System.out.println("Enter The ID And Name : ");
        id = scanner.nextInt();
        name = scanner.next();
    }
}

class Internal extends Student {
    int im1;
    int im2;

    void setMarks() {
        System.out.println("Enter The Im1 Mark : ");
        im1 = scanner.nextInt();
        System.out.println("Enter The Im2 Mark : ");
        im2 = scanner.nextInt();
    }

    void getinternal() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("IM1 Mark : " + im1);
        System.out.println("IM2 Mark : " + im2);
    }
}

class External extends Internal {
    int em1;
    int em2;

    void setexternal() {
        System.out.println("Enter The EM1 Mark : ");
        em1 = scanner.nextInt();
        System.out.println("Enter The EM2 Mark : ");
        em2 = scanner.nextInt();
    }

    void getexternal() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("EM1 Mark : " + em1);
        System.out.println("EM2 mark : " + em2);
    }
}
