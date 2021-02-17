/*
Решение задачи №8 по циклам
содержание задачи: https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
Автор: Нурсултан Куандык
git: lunarnuts
16-02-2021
 */
package com.tutorial;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1: ");
        String s1 = scan.nextLine().replaceAll("([.,])","");
        System.out.print("Enter number2: ");
        String s2 = scan.nextLine().replaceAll("([.,])","");

        HashSet<Character> hash1 = new HashSet<Character>();
        HashSet<Character> hash2 = new HashSet<Character>();

        for(int i=0;i<s1.length();i++) {
                hash1.add(Character.valueOf(s1.charAt(i)));
        }
        for(int i=0;i<s2.length();i++) {
            hash2.add(Character.valueOf(s2.charAt(i)));
        }
        hash1.retainAll(hash2);
        System.out.println(hash1);
        }
    }

