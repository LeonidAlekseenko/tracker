package ru.job4j.elementary.collection;

import java.util.Comparator;

public class JobSortByPriority implements Comparator<Job> {
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
