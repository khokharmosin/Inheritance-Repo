package com.infogalaxy;

public class Result extends Internal {
    int total;
    int perc;

    void calculate() {
        total = im1 + im2;
        perc = total / 2;
    }

    void getResult() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Im1 Marks : " + im1);
        System.out.println("Im2 Marks : " + im2);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + perc);
    }
}

class Main {
    public static void main(String[] args) {
        com.infogalaxy.Result result = new com.infogalaxy.Result();
        result.setStudent();
        result.setMarks();
        result.calculate();
        result.getResult();
    }
}


