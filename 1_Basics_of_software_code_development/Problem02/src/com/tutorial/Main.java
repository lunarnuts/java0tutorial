/*
Решение задачи №2 по линейным программам
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
        System.out.print("Enter value of a:");
        double a = scan.nextDouble();
        System.out.print("Enter value of b:");
        double b = scan.nextDouble();
        System.out.print("Enter value of c:");
        double c = scan.nextDouble();
        double result = (b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+1/(b*b);
        System.out.printf("Result of computation with given parameters a=%.3f, b=%.3f, c=%.3f is:%.3f",a,b,c,result);
    }
}
