/*
Решение задачи №3 по ветвлениям
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
        System.out.print("Enter x1: ");
        double x1 = scan.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scan.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scan.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scan.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scan.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scan.nextDouble();
        double m = (y2-y1)/(x2-x1); //угловой коэфициент прямой которая проходит через точки (х1,у1) и (х2,у2)
        double c = y2-m*x2; //коэфициент прямой которая проходит через точки (х1,у1) и (х2,у2)
        if (y3==m*x3+c) { //Если уравнение линии выполняется для точки (х3,у3) то все точки лежат на одной линии
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
