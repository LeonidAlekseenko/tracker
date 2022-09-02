package ru.job4j.sort;
import org.junit.Test;
import ru.job4j.elementary.sort.DepDescComp;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenFirstDepartmentIsDifferentThenAsc() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK1",
                "K1/SK1/SSK2"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenFirstDepartmentIsDifferentThenDesc() {
        int rsl = new DepDescComp().compare(
                "K1/SK1/SSK1",
                "K2/SK1"
        );
        assertThat(rsl, greaterThan(0));
    }
}