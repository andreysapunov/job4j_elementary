package ru.job4j;

public class Tusk000 {
    public static String nameInsert(String name) {
        String result = String.format("Привет, %s!", name);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String namePetr = Tusk000.nameInsert("Пётр");
        String nameIvan = Tusk000.nameInsert("Иван");
        String nameElena = Tusk000.nameInsert("Елена");
    }
}