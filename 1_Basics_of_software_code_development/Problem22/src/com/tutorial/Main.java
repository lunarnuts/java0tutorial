/*
Решение задачи №2 по циклам
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
        System.out.print("Enter lower bound: ");
        int a = scan.nextInt();
        System.out.print("Enter upper bound: ");
        int b = scan.nextInt();
        System.out.print("Enter step size: ");
        int h = scan.nextInt();
        while (a<b) {
            int y = (a>2)? a:-a;
            System.out.printf("y(%d)=%d%n",a,y);
            a+=h;
        }
    }
}
