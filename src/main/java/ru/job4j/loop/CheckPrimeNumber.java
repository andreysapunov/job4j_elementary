package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index <= number - 1; index++) {
            boolean canDivBy2 = true;
            if (number % index == 0) {
                prime = false;
            }
            break;
        }
        return prime;
    }
}