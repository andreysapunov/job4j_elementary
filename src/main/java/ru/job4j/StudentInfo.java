package ru.job4j;

public class StudentInfo {
    public static void main(String[] args) {
        int x = 6;
        int y = 6;
        int rsl;
        if (x == y) {
            rsl = x + y;
        } else {
            rsl = x * y;
        }
        System.out.println(rsl);
    }
}