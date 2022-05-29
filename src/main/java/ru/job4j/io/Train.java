package ru.job4j.io;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Drive on the rails");
    }
}
