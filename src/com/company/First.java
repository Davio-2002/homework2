package com.company;

import java.util.Random;

public class First {

    public static void main(String[] args) {
        Random random = new Random();
        int firstNum = random.nextInt(90) + 10;
        int secondNum = random.nextInt(90) + 10;

        System.out.println(firstNum);
        System.out.println(secondNum);

        long sum = firstNum + secondNum;

        System.out.println(sum);
    }
}
