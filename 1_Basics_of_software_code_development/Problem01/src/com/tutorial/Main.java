/*
Решение задачи №1 по линейным программам
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
        double z=((a-3)*b/2)+c;
        System.out.printf("Value of function with given parameters a=%f, b=%f,c=%f is: %f%n",a,b,c,z);
    }
}
