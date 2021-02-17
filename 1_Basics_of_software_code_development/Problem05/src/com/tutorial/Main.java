/*
Решение задачи №5 по линейным программам
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
        System.out.print("Enter T in seconds: ");
        int T = scan.nextInt();
        int hour = T/3600;
        int min = (T - hour*3600)/60;
        int sec = (T - hour*3600-min*60);
        System.out.printf("Result is %02d hour %02d min %02d seconds",hour,min,sec);
    }
}
