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

class Result extends Student {
    int perc;

    void setPerc() {
        System.out.println("Enter The Percentage : ");
        perc = scanner.nextInt();
    }

    void getResult() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Percentage : " + perc);
    }
}

class Main {
    public static void main(String[] args) {
        Result result = new Result();
        result.setStudent();
        result.setPerc();
        result.getResult();
    }
}

