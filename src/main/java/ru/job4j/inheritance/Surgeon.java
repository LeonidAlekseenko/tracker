package ru.job4j.inheritance;

public class Surgeon extends Profession {

    private int numberOfOperations;

    public Surgeon(String name, String surname, String education,
                   String birthday, int numberOfOperations) {
        super(name, surname, education, birthday);
        this.numberOfOperations = numberOfOperations;
    }

    public int getNumberOfOperations() {
        return numberOfOperations;
    }

    public static void surgeon(Operation operation) {

    }
}
