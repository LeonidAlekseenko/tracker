package ru.job4j.ex;
import org.junit.Test;
import ru.job4j.elementary.ex.Fact;

import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalc() {
        int n = -1;
        int result = Fact.calc(n);
    }
}