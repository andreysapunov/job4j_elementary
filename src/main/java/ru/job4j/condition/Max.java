package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }
    public static void main(String[] args) {
        int result1 = Max.max(20, 6);
        int result2 = Max.max(5, 12);
        int result3 = Max.max(6, 6);
        System.out.println(result3);
    }
}