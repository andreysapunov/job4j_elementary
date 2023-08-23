package ru.job4j;

import java.io.Console;

public class Tusk000 {
    public static void print(int x, int y) {
        String peremen = x + " " + y;
        System.out.println("Переменные: " + peremen);
        System.out.println("Сумма:" + (x + y));
        System.out.println("Произведение:" + (x * y));
    }

    public static void main(String[] args) {
    print(2, 3);
    }
}
