package com.company;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String monthName = src.nextLine();

        switch (monthName) {
            case "January", "March", "May", "July", "August", "October", "December" -> System.out.println(31 + " days");
            case "April", "June", "September", "November" -> System.out.println(30 + " days");
            case "February" -> System.out.println(28 + " or " + 29 + " days");
        }
    }
}
