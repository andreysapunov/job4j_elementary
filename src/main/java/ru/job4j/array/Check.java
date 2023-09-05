package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            boolean def = data[0];
            if (data[0] != data[index]) {
                result = false;
            }
        }
        return result;
    }
}