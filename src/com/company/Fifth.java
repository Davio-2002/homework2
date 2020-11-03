package com.company;

import java.util.Random;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String operation = src.nextLine();

        Random random = new Random();
        int firstNum = random.nextInt(100000);
        int secondNum = random.nextInt(100000);

        switch (operation)  {
            case "+" -> System.out.println(firstNum + secondNum);
            case "-" -> System.out.println(firstNum - secondNum);
            case "*" -> System.out.println(firstNum * secondNum);
            case "/" -> System.out.println(firstNum/ secondNum);
            default -> System.out.println("Something went wrong");
        }
    }
}
