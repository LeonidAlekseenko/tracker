package ru.job4j.elementary.inheritance;

public class Doctor extends Profession {

    private String allowance;

    public Doctor(String name, String surname, String education,
                  String birthday, String allowance) {
        super(name, surname, education, birthday);
        this.allowance = allowance;
    }

    public String getAllowance() {
        return allowance;
    }

    public void diagnosis(Patient patient) {

    }
}
