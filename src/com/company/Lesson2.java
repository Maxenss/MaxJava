package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson2 {
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
    public static void exampleLoops2(){
        boolean flag = true;

        while(flag){
            System.out.println();
        }

        System.out.println();
    }

    // Фича с одной командой
    public static void oneCommandExample(){
        int a = 20;

        if (a > 10)
            System.out.println("a > 10");

        for (int i = 0; i < 10; i++)
            System.out.println(a);
    }
}