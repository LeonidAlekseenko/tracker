package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.elementary.collection.*;

import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority0() {
        Comparator<Job> cmpNamePriority = new JobDescByName().
                thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityUp() {
        Comparator<Job> cmpNamePriority = new JobSortByName().
                thenComparing(new JobSortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)

        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenDescByPriority() {
        Comparator<Job> cmpName = new JobDescByPriority();
        int rsl = cmpName.compare(
                new Job("Work", 30),
                new Job("Job", 20)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityUpToSecondAction() {
        Comparator<Job> cmpNamePriority = new JobSortByName().
                thenComparing(new JobSortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 2),
                new Job("Impl task", 1)

        );
        System.out.println(rsl);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityDownToSecondAction() {
        Comparator<Job> cmpNamePriority = new JobDescByName().
                thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 2),
                new Job("Impl task", 1)

        );
        assertThat(rsl, lessThan(0));
    }

}