package ru.job4j.elementary.inheritance;

public class Dentist extends Profession {

    private int price;

    public Dentist(String name, String surname, String education, String birthday, int price) {
        super(name, surname, education, birthday);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void dentist(Treatment treatment) {

    }
}
