package ru.job4j.io;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Drive");
    }
}
