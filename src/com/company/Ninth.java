package com.company;

import java.util.Random;

public class Ninth {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNum = random.nextInt(50) + 25;
        int secondNum = random.nextInt(50) + 25;

        System.out.printf("%d %d \n", firstNum, secondNum);

        int firstIntPart = firstNum / 10;
        int secondIntPart = secondNum / 10;

        int firstRemainder = firstNum % 10;
        int secondRemainder = secondNum % 10;

        System.out.println((firstIntPart == secondIntPart) || (firstRemainder == secondRemainder) || (firstIntPart == secondRemainder) || (secondIntPart == firstRemainder));
    }
}
