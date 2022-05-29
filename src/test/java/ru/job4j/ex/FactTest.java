package ru.job4j.ex;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalc() {
        int n = -1;
        int result = Fact.calc(n);
    }
}