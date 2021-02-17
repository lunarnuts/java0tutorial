/*
Решение задачи №4 по линейным программам
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
        System.out.print("Enter value of R in nnn.ddd format: ");
        double R = scan.nextDouble();
        double result=(R%1)*1000+(R/1000);
        System.out.printf("Result is %03d.%03d",(int)(result/1),(int)R);
    }
}
