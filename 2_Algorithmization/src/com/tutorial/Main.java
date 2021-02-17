/*
Решение задач по алгоритмам
Содержание задачи: https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
Автор: Нурсултан Куандык
git: lunarnuts
17-02-2021
 */
package com.tutorial;

import javax.xml.stream.events.StartDocument;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task01();
        //task02();
        //task03();
        //task04();
        //task05();
        task06();
    }
    public static void task01() {
        /*
            1.В массив А[N] занесены натуральные числа.
            Найти сумму тех элементов, которые кратны данному К
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        int[] array;
        array = new int[n];
        for (int i=0;i<n;i++) {
            array[i] = scan.nextInt();
        }
        System.out.print("Enter K: ");
        int k = scan.nextInt();
        int sum = 0;
        for (int i:array) {
            if (i%k==0) {
                sum+=i;
            }
        }
        System.out.printf("Sum of elements divisible by k is %d%n",sum);
    }
    public static void task02() {
        /*
            2. Дана последовательность действительных чисел а1,а2,а3...,аn.
            Заменить все ее члены, большие данного Z,этим числом. Подсчитать количество замен.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        double[] array;
        array = new double[n];
        for (int i=0;i<n;i++) {
            array[i] = scan.nextDouble();
        }

        System.out.print("Enter Z: ");
        double z = scan.nextDouble();

        int sum = 0;
        for (int i=0;i<n;i++) {
            if (array[i]>z) {
                array[i]=z;
                sum+=1;
            }
        }
        System.out.print("New array: ");
        System.out.println(Arrays.toString(array));
        System.out.printf("%d elements were replaced%n",sum);
    }
    public static void task03() {
        /*
            3.Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем
            отрицательных, положительных и нулевых элементов.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements N: ");
        int n = scan.nextInt();
        double[] array;
        array = new double[n];
        for (int i=0;i<n;i++) {
            array[i] = scan.nextDouble();
        }
        int neg=0,pos=0,zero=0;
        for (double elem:array) {
            if (elem>0) {
                pos++;
            } else if (elem<0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.printf("Array has %d positive, %d negative, %d zero elements.",pos,neg,zero);
    }
    public static void task04() {
        /*
            4. Даны действительные числа а1,а2,а3,...,аn.
            Поменять местами наибольший и наименьший элементы.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        double[] array;
        array = new double[n];
        for (int i=0;i<n;i++) {
            array[i] = scan.nextDouble();
        }
        System.out.println("Old array: "+Arrays.toString(array));
        int min=0,max=0;
        for (int i=0;i<n;i++) {
            if (array[i]>array[max]) {
                max= i;
            }
            if (array[i]<array[min]) {
                min=i;
            }
        }
        double temp = array[min];
        array[min]=array[max];
        array[max]=temp;
        System.out.printf("New array: "+Arrays.toString(array));
    }
    public static void task05() {
        /*
            5. Даны целые числа а1,а2,а3,...,аn.
            Вывести на печать только те числа, для которых a[i]>i.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        int[] array;
        array = new int[n];
        for (int i=0;i<n;i++) {
            array[i] = scan.nextInt();
        }
        for (int i=0;i<n;i++) {
            if (array[i]>i+1) {
                System.out.printf("%d ",array[i]);
            }
        }
        System.out.println();
    }
    public static void task06() {
        /*
            6. Задана последовательность N вещественных чисел.
            Вычислисть сумму чисел, порядковые номера которых являются простыми.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        double[] array;
        array = new double[n];
        for (int i=0;i<n;i++) {
            array[i] = scan.nextDouble();
        }
        double sum =0;
        for (int i=0;i<n;i++) {
            BigInteger index = BigInteger.valueOf(i+1); //индекс начинается с 1 потому +1
            if (index.isProbablePrime(1)) {
                sum+=array[i];
            }
        }
        System.out.println("Sum is equal to "+sum);
    }
}
