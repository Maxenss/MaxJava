package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        example1();
    }

    public static void example1() {
        double[] banks;
        int n = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите количество банков: ");
                n = Integer.parseInt(scanner.next());
                break;
            } catch (Exception ex) {
                //ex.printStackTrace();
                System.out.println("Повторите ввод");
            }
        }

        // Инициализация массива
        banks = new double[n];

        for (int i = 0; i < banks.length; i++) {
            banks[i] =  25 + (Math.random() * 2);   // 0...1
        }

        double maxValue = banks[0];
        double minValue = banks[0];
        int minValueIndex = 0;
        int maxValueIndex = 0;

        String.format("%.3f", 0.23124214);

        // Вывод массива на экран
        // System.out.println(Arrays.toString(banks));
        for (int i = 0; i < banks.length; i++) {
            System.out.print(
                    String.format("%.3f", banks[i]) + " "
            );
        }

        // Поиск максимального и минимального
        for (int i = 0; i < banks.length; i++) {
            if (maxValue <= banks[i]) {
                maxValue = banks[i];
                maxValueIndex = i;
            }

            if (minValue >= banks[i]) {
                minValue = banks[i];
                minValueIndex = i;
            }
        }

        System.out.println("\nМаксимальный элемент " + String.format("%.3f", maxValue)
                + ", его индекс - " + maxValueIndex);
        System.out.println("Минимальный элемент " + String.format("%.3f", minValue)
                + ", его индекс - " + minValueIndex);
    }
}
