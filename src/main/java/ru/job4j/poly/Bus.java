package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Движение");
    }

    @Override
    public void passengers(int numbers) {
        System.out.println("100");
    }

    @Override
    public int refuel(int fuel) {
        int price = 45;
        return price * fuel;
    }
}
