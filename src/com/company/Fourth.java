package com.company;

import java.util.Random;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();

        Random random = new Random();

        if (num > 100) {
            int randNum1 = random.nextInt(num - 50) + 50;
            String strRand1 = String.valueOf(randNum1);
            System.out.println(strRand1);

        } else if (num < 100) {
            int randNum2 = random.nextInt(50);
            String strRand2 = String.valueOf(randNum2);
            System.out.println(strRand2);
        }
    }
}
