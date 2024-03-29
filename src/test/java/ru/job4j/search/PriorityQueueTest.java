package ru.job4j.search;

import org.junit.Test;
import ru.job4j.elementary.search.PriorityQueue;
import ru.job4j.elementary.search.Task;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}