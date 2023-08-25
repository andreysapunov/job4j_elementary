package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println(result);
        first = 7;
        second = 9;
        boolean result2 = first < second;
        System.out.println(result2);
        first = 3;
        second = 3;
        boolean result3 = first == second;
        System.out.println(result3);
    }
}