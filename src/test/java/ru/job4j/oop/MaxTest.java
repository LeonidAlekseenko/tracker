package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.elementary.oop.Max;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To4Then4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}