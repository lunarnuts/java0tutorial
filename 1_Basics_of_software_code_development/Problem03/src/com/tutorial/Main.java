/*
Решение задачи №3 по линейным программам
содержание задачи: https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
Автор: Нурсултан Куандык
git: lunarnuts
16-02-2021
 */
package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of x:");
        double x = scan.nextDouble();
        System.out.print("Enter value of y:");
        double y = scan.nextDouble();
        double result = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.printf("Result of computation with given parameters x=%.3f, y=%.3f is: %.3f",x,y,result);
    }
}
