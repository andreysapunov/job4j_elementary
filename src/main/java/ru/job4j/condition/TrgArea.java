package ru.job4j.condition;
public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static void main(String[] args) {
        double area = TrgArea.area(2, 2, 2);
        double area2 = TrgArea.area(40, 15, 27);
        System.out.println("area (2, 2, 2) = " + area);
        System.out.print("area (40, 15, 27) = " + area2);
    }
}