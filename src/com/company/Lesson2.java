package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        //   System.out.println(factorial(10));

        // hw3_4();
        hw3_7();
    }

    // Логика. Логические конструкции. Ветвления. Циклы
    public static void example1() {
        boolean isCondition;  // true, false

        // Логические операции
        // "И", "AND" по своему принипу работает так, что все составляющие выражения дллжны быть истины
        // "&&"
        // 0 && 0 = 0
        // 0 && 1 = 0
        // 1 && 0 = 0
        // 1 && 1 = 1

        // "ИЛИ"
        // ||
        // 0 || 0 = 0
        // 0 || 1 = 1
        // 1 || 0 = 1
        // 1 || 1 = 1

        // "НЕ"
        // !
        // !0 = 1
        // !1 = 0

        // "ИСКЛЮЧАЮЩИЕ ИЛИ"
        // "^"
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1
        // 1 ^ 1 = 0

        // Разница между & и &&

        // Пример
        // 0 && 1 = 0  &
        // 1 || 0  = 1 |
    }

    // Логические конструкции
    public static void example2() {
        // if
        int a = 10;
        int d = 0;

        if (d != 0) {
            System.out.println(a / d);
        }

        // if-else
        if (d != 0) {
            System.out.println(a / d);
        } else {
            System.out.println("На ноль делить нельзя!");
        }

        // if - else-if - else
        int b = 20;
        int c = 30;

        if (b > c) {
            System.out.println("b > c");
        } else if (b == c) {
            System.out.println("b == c");
        } else {
            System.out.println("b < c");
        }

        // switch-case
        int z = 1;

        switch (z) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
        }

        // switch-case-default
        switch (z) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Попали в default");
                break;
        }

        // тернарный оператор
        int a1 = 20;
        int b1 = 30;

        int max;

        if (a1 > b1) {
            max = a1;
        } else {
            max = b1;
        }

        max = a1 > b1 ? a1 : b1;

        // instanceof
        ArrayList<Integer> list = new ArrayList<>();
        if (list instanceof List) {
            System.out.println("list instanceof List");
        }

        // Опаераторы сравнение
        // == - сравнение на равенство
        // >
        // <
        // >=
        // <=
        // != - не равно
    }

    // Пример с проваливанием
    public static void example3() {
        // Задача, по введеном индексу дня недели, определить это будий или выходной

        int dayOfWeek = 1;

        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будний");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
        }
    }

    // Циклы
    public static void exampeLoops1() {
        // while - цикл с предусловием
        // Сначала проверяем условие, потом выполняем цикл

        int a = 10;
        int b = 20;

        while (a < b) {
            System.out.println(a);
            ++a;
        }

        // Можно было бы записать на C++
        /*
        Mark1: cout << a;
        if (a < b) goto Mark1;
         */

        // do-while - цикл с постусловием
        // Сначала выполняем тело цикла, а потом проверяем можем ли ми продолжить выполнение цикла

        do {
            System.out.println("Сделали что-то");
        } while (b < a);

        // цикл for
        // используется для работы с массивами

        // for ([блок инициализации]; [условие]; [шаг]){ тело цикла;}

        for (int i = 0; i < 10; i++) {

        }

        // continue - немедленно перейти на след. итерацию
        // break - немедленно завершить цикл

        int opr1 = 0;
        Random random = new Random();

        while (true) {
            a = random.nextInt(100);
            System.out.println(a);

            if (a == 50) {
                break;
            }
        }
    }

    // Цикл бесконечный
    public static void exampleLoops2() {
        boolean flag = true;

        while (flag) {
            System.out.println();
        }

        System.out.println();
    }

    // Фича с одной командой
    public static void oneCommandExample() {
        int a = 20;

        if (a > 10)
            System.out.println("a > 10");

        for (int i = 0; i < 10; i++)
            System.out.println(a);
    }

    // Простой вариант, разить известное число на разряды
    public static void hw2_7() {
        int a = 567;

        // Фича
        int сотые = a / 100; // 5
        int десятки = (a - сотые * 100) / 10; // 6
        int единицы = (a - сотые * 100 - десятки * 10); // 7

        int b = 567;
        int opr2 = 100;
        int result = 0;

        while (opr2 >= 1) {
            result = b / opr2;
            System.out.println(result);
            b = b % opr2;
            opr2 = opr2 / 10;
        }
    }

    public static void hw3_4() {
        Scanner scanner = new Scanner(System.in);
        int n = 30;
        double z = 0;

        // Вводимая пользователем
        double x = 0;

        for (int i = 1; i <= 20; i++) {
            for (int k = 1; k < n; k++) {
                System.out.print("Введите х: ");
                x = scanner.nextDouble();

                int fact = 1;
                for (int j = 2; j <= k; j++) {
                    fact *= i;
                }

                z = Math.pow(x, k) / fact;

                System.out.println(z);
            }
        }
    }

    public static void hw3_7() {
        int counter = 0;
        int h = 1;

        for (int i = 100; counter < 15; i += h) {
            if (i % 19 == 0) {
                ++counter;
                System.out.println("Число с индексом " + counter + ", значение - " + i);
                h = 19;
                }
        }
    }

    // Факториал
    public static int factorial(int num) {
        int result = 1;

        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
