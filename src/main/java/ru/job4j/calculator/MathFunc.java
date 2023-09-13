package ru.job4j.calculator;

public class MathFunc {
    public static int funcMultip(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int funcDiv(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.funcMultip(3);
        int result2 = MathFunc.funcDiv(5);
        int result3 = MathFunc.funcMultip(100);
        int total = result1 + result2;
        System.out.println(total);
        System.out.print(result3);
    }
}