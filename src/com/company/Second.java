package com.company;

import java.util.Random;

public class Second {
    public static void main(String[] args) {
        Random random = new Random();
        long firstCastedProduct;
        double secondCastedProduct;

        int firstNum = random.nextInt(90) + 10;
        int secondNum = random.nextInt(90) + 10;

        int product = firstNum * secondNum;

        if (product % 2 == 0) {
            firstCastedProduct = product;
            System.out.println(firstCastedProduct);
        } else {
            secondCastedProduct = product;
            System.out.println(secondCastedProduct);
        }
    }
}
