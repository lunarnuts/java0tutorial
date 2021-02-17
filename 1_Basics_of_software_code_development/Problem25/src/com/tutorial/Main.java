/*
Решение задачи №5 по циклам
содержание задачи: https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
Автор: Нурсултан Куандык
git: lunarnuts
16-02-2021
 */
package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter e=");
        double e = scan.nextDouble();
        System.out.println("Enter n=");
        int n = scan.nextInt();

        double an = 0.0;
        double sum = 0.0;

        for (int i = 2; i <= n; i++) {
            an = Math.pow(-1, i - 1) / i; //an=1/(2^n)-1/(3^n)
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Sum is" + sum);
    }
}
