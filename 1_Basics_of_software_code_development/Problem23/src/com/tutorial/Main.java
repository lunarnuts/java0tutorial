/*
Решение задачи №3 по циклам
содержание задачи: https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
Автор: Нурсултан Куандык
git: lunarnuts
16-02-2021
 */
package com.tutorial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Using identity that S(n)=n(n+1)(2n+1)/6 we can avoid using loops
        int n = 100;
        int sum = n*(n+1)*(2*n+1)/6;
        System.out.printf("Sum of squares of first 100 natural numbers: %d%n",sum);
        */
        int n =1;
        int sum = 0;
        while(n<=100) {
            sum+=n*n;
            n++;
        }
        System.out.printf("Sum of squares of first 100 natural numbers: %d%n",sum);
    }
}
