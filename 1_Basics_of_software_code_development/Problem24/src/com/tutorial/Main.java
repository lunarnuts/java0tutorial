/*
Решение задачи №4 по циклам
содержание задачи: https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
Автор: Нурсултан Куандык
git: lunarnuts
16-02-2021
 */
package com.tutorial;

import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.printf("Sum of multiplication of first 200 natural numbers: %d%n",s);
    }
}
