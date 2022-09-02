package ru.job4j.elementary.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String ch = "\"";
        return "{" + System.lineSeparator()
                + ch + name + ch + " : " + ch + name + ch + System.lineSeparator() + ch
                + body + ch + " : " + ch + body + ch + System.lineSeparator() + "}";
    }

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("name", "body");
        System.out.println(text);
    }
}
