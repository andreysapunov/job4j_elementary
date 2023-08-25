package ru.job4j;

public class Tusk000 {
    public static String nameInsert(String name) {
        return name;
    }

    public static void main(String[] args) {
        String namePetr = Tusk000.nameInsert("Пётр");
        String nameIvan = Tusk000.nameInsert("Иван");
        String nameElena = Tusk000.nameInsert("Елена");
        String result = String.format("Привет, %s!", namePetr);
        String result2 = String.format("Привет, %s!", nameIvan);
        String result3 = String.format("Привет, %s!", nameElena);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}