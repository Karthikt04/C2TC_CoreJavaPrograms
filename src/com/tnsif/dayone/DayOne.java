package com.tnsif.dayone;

public class DayOne {

    public static void main(String[] args) {

        System.out.println("Hello World");
        int age = 20;
        double salary = 60000.00;
        int roundSalary = (int) salary; //data narrowing - explicit
        double wholeSalary = roundSalary; //data widening - implicit
        System.out.println("salary: "+salary);
        System.out.println("data narrowing round salary: "+ roundSalary);
        System.out.println("data widening whole salary: "+ wholeSalary);

    }

}
