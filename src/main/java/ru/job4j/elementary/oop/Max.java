package ru.job4j.elementary.oop;

public class Max {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return Max.max(Max.max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
}
