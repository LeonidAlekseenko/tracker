package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when40then() {
        double expected = 4.0;
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40then60() {
        double expected = 4.0;
        Point b = new Point(0, 0, 0);
        Point c = new Point(0, 4, 0);
        double out = b.distance3d(c);
        Assert.assertEquals(expected, out, 0.01);
    }
}