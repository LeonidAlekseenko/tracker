package ru.job4j.elementary.inheritance;
public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
