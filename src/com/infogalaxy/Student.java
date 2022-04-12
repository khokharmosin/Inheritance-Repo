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
        System.out.println("Enter The Im1 Marks : ");
        im1 = scanner.nextInt();
        System.out.println("Enter The Im2 Marks : ");
        im2 = scanner.nextInt();
    }
}
