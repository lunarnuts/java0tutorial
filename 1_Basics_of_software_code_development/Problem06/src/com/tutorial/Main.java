/*
Решение задачи №6 по линейным программам
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
        System.out.print("Enter x coordinate: ");
        double x = scan.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = scan.nextDouble();
        if (x*x + y*y+2*y +1 < 0.25) { //формула круга - если выражение (x-a)^2+(y-b)^2<r то точка х,у находятся внутри круга
            System.out.println("false1");
        } else if (y<-3||y>4) {
            System.out.println("false2");
        } else if (x<-4||x>4) {
            System.out.println("false3");
        } else if ((y>0&&x>=-4&&x<-2)||(y>0&&x>2&&x<=4)) {
            System.out.println("false4");
        } else {
            System.out.println("true");
        }
    }
}
