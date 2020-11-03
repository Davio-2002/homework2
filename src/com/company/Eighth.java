package com.company;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        int radius = 5;

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        Scanner src = new Scanner(System.in);
        int number = src.nextInt();

        switch (number) {
            case 1 -> System.out.println("Your area is " + area);
            case 2 -> System.out.println("Your perimeter is " + perimeter);
            case 3 -> System.exit(0);
        }
    }
}
