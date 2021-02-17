/*
Решение задачи №6 по циклам
содержание задачи: https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
Автор: Нурсултан Куандык
git: lunarnuts
16-02-2021
 */
package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Decimal      Symbol");
        for (int i=32;i<=126;i++) {
            System.out.printf("%03d %10s%n",i,(char)i);
        }
    }
}
