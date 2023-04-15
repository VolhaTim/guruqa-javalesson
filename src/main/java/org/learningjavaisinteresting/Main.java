package org.learningjavaisinteresting;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        //математические оперции
        int rate = 15;
        int HoursPerWeek = 40;
        int WeeksPerMonth = 4;
        int resultInt = rate*HoursPerWeek*WeeksPerMonth;
        System.out.println(resultInt);

        int items = 23;
        int res = items%5;
        System.out.println(res);

        //логические операции

        int currentAge = 20;//динамическое число

        boolean canMarried = currentAge >= 18;
        boolean cantMarried = currentAge > 0 && currentAge < 18;
        boolean error = currentAge < 0;

        // переполнение при математических операциях
        byte x = 100;
        byte y = 30;
        byte resultByte = (byte) (x+y);
        System.out.println(resultByte);

        int a = -2147483648;
        int b = 1;
        System.out.println (a-b);

        //комбинированные данные int и double
        int amount = 10000;
        double price = 1.500;
        System.out.println(amount-price);


    }
}