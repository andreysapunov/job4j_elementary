package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(3600);
        float euro = Converter.rubleToEuro(4900);
        System.out.println("1 долар = " + dollar + " рублей.");
        System.out.println("1 евро = " + euro + " рублей.");
    }
}