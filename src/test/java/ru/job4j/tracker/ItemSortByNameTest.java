package ru.job4j.tracker;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ItemSortByNameTest {

    @Test
    public void whenSortByName() {
        Item item1 = new Item("D");
        Item item2 = new Item("C");
        Item item3 = new Item("B");
        Item item4 = new Item("A");
        List<Item> input = Arrays.asList(item1, item2, item3, item4);
        input.sort(new ItemSortByName());
        assertEquals(input.get(0).getName(), "A");
        assertEquals(input.get(1).getName(), "B");
        assertEquals(input.get(2).getName(), "C");
        assertEquals(input.get(3).getName(), "D");

    }

    @Test
    public void whenSortByNameRes() {
        Item item1 = new Item("D");
        Item item2 = new Item("C");
        Item item3 = new Item("B");
        Item item4 = new Item("A");
        Item item5 = new Item("E");
        List<Item> input = Arrays.asList(item1, item2, item3, item4, item5);
        input.sort(new ItemSortByNameResOrder());
        assertEquals(input.get(0).getName(), "E");
        assertEquals(input.get(1).getName(), "D");
        assertEquals(input.get(2).getName(), "C");
        assertEquals(input.get(3).getName(), "B");
        assertEquals(input.get(4).getName(), "A");
    }

}