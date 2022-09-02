package ru.job4j.elementary.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 1) {
            System.out.println("Да");
        } else if (answer == 2) {
            System.out.println("Нет");
        } else {
            System.out.println("Возможно");
        }
    }
}
