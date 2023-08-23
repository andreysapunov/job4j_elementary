package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double three = Math.pow(one, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        double six = Math.pow(five, 0.5);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(6, 3, 1, 2);
        double result3 = Point.distance(1, 8, 21, 6);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (6, 3) to (1, 2) " + result2);
        System.out.println("result (1, 8) to (21, 6) " + result3);
    }
}