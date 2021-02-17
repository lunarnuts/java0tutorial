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
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = scan.nextInt();
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        for (int i = m;i<=n;i++) {
            System.out.printf("%d: ", i);
            for (int j = 2; j <= (i / 2); j++){
                if (i%j==0) {
                    System.out.printf("%d  ",j);
                }
            }
            System.out.println();
        }
    }
}
