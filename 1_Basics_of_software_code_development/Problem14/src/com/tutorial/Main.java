/*
Решение задачи №4 по ветвлениям
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
        System.out.print("Enter A: ");
        double A = scan.nextDouble();
        System.out.print("Enter B: ");
        double B = scan.nextDouble();
        System.out.print("Enter x: ");
        double x = scan.nextDouble();
        System.out.print("Enter y: ");
        double y = scan.nextDouble();
        System.out.print("Enter z: ");
        double z = scan.nextDouble();

        double minSize = Math.min(A,B);
        double maxSize = Math.max(A,B);
        double minBrick = Math.min(Math.min(x,y),z);
        double midBrick = Math.min(Math.max(x,y),z);

        if (A*B>=minBrick*midBrick) {
            if (minSize>=minBrick || maxSize>=midBrick) {
                System.out.println("True");
            }
        } else {
            System.out.println("False");
        }
    }
}
