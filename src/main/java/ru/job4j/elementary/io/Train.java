package ru.job4j.elementary.io;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Drive on the rails");
    }
}
