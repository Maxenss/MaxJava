package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // example1();

    }

    // Типы данных и математика
    public static void example1() {
        // sout
        System.out.println("");

        // Типы данных
        // делятся на:
        // Примитивные типы
        // Сложные типы

        // Примитивные типы
        // Целоч. - byte (8-bit), short(16 bit), int(32 bit), long(64)   --- int
        // Веществ. - float (32 bit), double (64 bit)                    --- double
        // Симвлоы - char (16 bit)
        // Логический тип - boolean (1 bit)

        // Сложные типы
        // Все классы и объекты
        // String, Random, Scanner и т.д.

        // работа с переменными
        // Объявление переменной
        int a;
        // Инициализвация переменной
        a = 20;

        //
        int b = 30;

        // Для считывания ввода
        Scanner scanner = new Scanner(System.in);

        int c = 0;
        c = scanner.nextInt();

        int opr1 = 0;
        int opr2 = 0;
        int opr3 = 0;

        System.out.println("Введите opr1: ");
        opr1 = scanner.nextInt();

        int result;

        // Ctrl + D
        result = 10 + 10;
        result = 10 - 10;
        result = 10 * 10;
        result = 10 / 10;
        // Остаток от деления
        result = 10 % 3;

        // Инкремент, декремент
        int i = 0;
        i++;    // ув. на 1
        i--;    // ум. на 1

        // Сокращенные ар. операции
        int z = 10;
        z = z + 10;

        z += 10;
        z -= 10;
        z *= 10;
        z /= 10;
        z %= 10;

        // Форматирование кода - Ctrl + Alt + L
    }

    // Работа с мат. библиотекой
    public static void example2() {
        double x = 20;
        double result = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x + 1));
        System.out.println(result);
    }

    // Функции и процедуры
    public static void example3() {
        // Процедура, которая ничего не возвращает
        System.out.println(10);

        // Функция в которую мы ничего не передаем, но получаем от нее данные
        ArrayList<Integer> list = new ArrayList<>();
        int size = list.size();
        System.out.println(size);

        // Процедура ничего ен примает, ничего не возвращает
        list.clear();

        // Функция которая принимает, и возвращает
        double a = Math.sqrt(10);
    }
}
