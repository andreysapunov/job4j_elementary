package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(6, 3, 1, 2);
        double result3 = Point.distance(1, 8, 2, 6);
        double result4 = Point.distance(2, 3, 7, 2);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (6, 3) to (1, 2) " + result2);
        System.out.println("result (1, 8) to (2, 6) " + result3);
        System.out.println("result (2, 3) to (7, 2) " + result4);
    }
}