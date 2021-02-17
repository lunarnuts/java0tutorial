/*
Решение задачи №1 по циклам
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
        System.out.print("Enter any positive integer: ");
        int n = scan.nextInt();
        int sum =0;
        for (int i =1;i<=n;i++) {
            sum+=i;
        }
        System.out.println("Sum is: "+sum);
    }
}
