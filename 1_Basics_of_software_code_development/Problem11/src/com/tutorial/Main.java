/*
Решение задачи №1 по ветвлениям
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
        System.out.print("Enter angle alpha: ");
        double alpha = scan.nextDouble();
        System.out.print("Enter angle beta: ");
        double beta = scan.nextDouble();
        double gamma = 180 - alpha - beta;
        if (alpha>0&&beta>0&&gamma>0&&(alpha+beta+gamma == 180)) {
            if (alpha==90 || beta==90||gamma==90) {
                System.out.println("It's a right angled triangle.");
            } else {
                System.out.println("It is a triangle.");
            }
        } else {
            System.out.printf("It's not a triangle.");
        }
    }
}
