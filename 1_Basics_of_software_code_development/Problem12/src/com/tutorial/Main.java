/*
Решение задачи №2 по ветвлениям
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
        // write your code here
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        System.out.print("Enter a: ");
        double a = scan.nextDouble();
        System.out.print("Enter b: ");
        double b = scan.nextDouble();
        System.out.print("Enter c: ");
        double c = scan.nextDouble();
        System.out.print("Enter d: ");
        double d = scan.nextDouble();
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
