/*
Решение задачи №5 по ветвлениям
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
        System.out.print("Enter X: ");
        double x = scan.nextDouble();
        double fx = x*x-3*x+9;

        if (x>3) {
            fx = 1/(x*x*x+6);
        }
        System.out.println("Result: "+fx);
    }
}
