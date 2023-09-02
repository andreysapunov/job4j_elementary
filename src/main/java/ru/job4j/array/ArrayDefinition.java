package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] price = new float[40];
        System.out.println("Размер массива равен: " + price.length);
        String[] names = new String[4];
        System.out.println("Размер массива равен: " + names.length);
        names[0] = "Sapunov Andrei";
        names[1] = "Sapunova Olga";
        names[2] = "Sapunov Yaroslav";
        names[3] = "Zotov Nikita";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}