package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.elementary.collection.Order;
import ru.job4j.elementary.collection.OrderConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenDuplicateOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("3sfe", "Dr"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(1, map.size());
    }
}