package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    арифметическое элементов каждого массива и сообщите, для какого из
    массивов это значение оказалось больше (либо сообщите, что их средние
    арифметические равны).*/
        double sum1 = 0;
        double sum2 = 0;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(16);
            System.out.print(arr[i] + " ");
            sum1 = arr[i] / arr.length;

        }
        System.out.println();
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            Random rnd = new Random();
            arr2[i] = rnd.nextInt(16);
            System.out.print(arr2[i] + " ");
            sum2 = arr2[i] / arr2.length;
        }
        System.out.println(" ");
        if (sum1 == sum2) {
            System.out.println("Средние арифметические массивов равны");
        } else if (sum1 > sum2) {
            System.out.println("Среднее арифметическое первого массива больше, чем второго");
        } else {
            System.out.println("Средние арифметическое первого массива меньше, чем второго");
        }
    }
}
