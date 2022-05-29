package ru.job4j.tracker;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));  /* Добавим в tracker новую заявку */
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"});
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteAction(out));
        actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ShowAction(out));
        actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat((out.toString()), is("Menu."
                + System.lineSeparator() + "0. Show all items"
                + System.lineSeparator() + "1. Exit"
                + System.lineSeparator() + "Show all items"
                + System.lineSeparator() + item
                + System.lineSeparator() + "Menu."
                + System.lineSeparator() + "0. Show all items"
                + System.lineSeparator() + "1. Exit"
                + System.lineSeparator()));
    }

    @Test
    public void whenSearchByIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new SearchByIdAction(out));
        actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat((out.toString()), is("Menu."
                + System.lineSeparator() + "0. Find item by Id"
                + System.lineSeparator() + "1. Exit"
                + System.lineSeparator() + "Find item by Id"
                + System.lineSeparator() + item
                + System.lineSeparator() + "Menu."
                + System.lineSeparator() + "0. Find item by Id"
                + System.lineSeparator() + "1. Exit"
                + System.lineSeparator()));
    }

    @Test
    public void whenSearchByNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item name"));
        String name = "New item name";
        Input in = new StubInput(
                new String[]{"0", name, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new SearchByNameAction(out));
        actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat((out.toString()), is("Menu."
                + System.lineSeparator() + "0. Find items by name"
                + System.lineSeparator() + "1. Exit"
                + System.lineSeparator() + "Find items by name"
                + System.lineSeparator() + item.toString()
                + System.lineSeparator() + "Menu."
                + System.lineSeparator() + "0. Find items by name"
                + System.lineSeparator() + "1. Exit"
                + System.lineSeparator()));
    }

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenMultipleInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0", "1", "2"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = 0;
        input.askInt("Enter menu:");
        input.askInt("Enter menu:");
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenNegativeNumberInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-4"});
        ValidateInput input = new ValidateInput(out, in);
        int selected =  0;
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(-4));
    }
}