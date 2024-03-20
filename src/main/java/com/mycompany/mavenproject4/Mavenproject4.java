package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = new String[8];
        for (int i = 1; i <= 8; i++) {
            float grade;
            System.out.println("enter the material name:");
            arr[i - 1] = input.next();
            System.out.println("enter the grade:");
            grade = input.nextInt();
            if (grade < 0) {
                i--;
                System.out.println("the grade cannot be less than 0");
            } else {
                calculateGrade(grade);
            }
        }

    }

    public static void calculateGrade(float Grade) {

        if (Grade <= 100 && Grade >= 90) {
            System.out.println("the grade is :A+");
        } else if (Grade < 90 && Grade >= 80) {
            System.out.println("the grade is :A");
        } else if (Grade < 80 && Grade > +70) {
            System.out.println("the grade is :B");
        } else if (Grade < 70 && Grade >= 60) {
            System.out.println("the grade is :C");
        } else if (Grade < 60100 && Grade >= 50) {
            System.out.println("the grade is :D");
        } else {
            System.out.println("the grade is :F");

        }
    }
}
