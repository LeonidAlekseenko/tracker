package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNotName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ger", "Faust", "000000", "Ad")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.size(), is(0));
    }
}