package com.company;

public class Lesson4 {
    public static void main(String[] args) {

    }

    public static void arraysLecture() {
        // Массив - это множество однотипных элементов

        // Чем характ. массив:
        // - Кол-во элементов
        // - Тип элементов
        // - Размерность (одномерным(вектор), двухмерный(матрица), ...)
        // - Имя массива

        // Объвление массива
        int[] arrayNew;         // null
        // Инициализация массива
        arrayNew = new int[10]; // Создать в памяти массив элементов типа int на 10 ячеек
        // Одновременно
        int[] arrayNew2 = new int[20];
        // Работа с элементами массива
        for (int i = 0; i < arrayNew2.length; i++) {
            arrayNew2[i] = i * 3;
            System.out.println(arrayNew2[i]);
        }
    }
}
