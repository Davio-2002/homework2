package com.company;

import java.util.Random;

public class Third {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(90) + 10;

        int square = (int) Math.pow(number, 2);

        String strSquare = String.valueOf(square);

        System.out.println(strSquare);
    }
}
