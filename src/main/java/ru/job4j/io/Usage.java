package ru.job4j.io;

public class Usage {
    public static void main(String[] args) {
        Plane an1 = new Plane();
        Plane an2 = new Plane();
        Train tr1 = new Train();
        Train tr2 = new Train();
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        Vehicle[] vehicles = new Vehicle[]{an1, an2, tr1, tr2, bus1, bus2};
        for (Vehicle a : vehicles) {
            a.move();
        }

    }
}
