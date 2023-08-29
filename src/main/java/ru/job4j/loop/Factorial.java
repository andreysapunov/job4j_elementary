package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 0) {
                fac = i;
            }
        }
        return fac;
    }
}