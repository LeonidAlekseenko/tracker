package ru.job4j.elementary.inheritance;

public class Builder extends Profession {

    private int rating;

    public Builder(String name, String surname, String education, String birthday, int rating) {
        super(name, surname, education, birthday);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public static void builder(Building building) {

    }
}
