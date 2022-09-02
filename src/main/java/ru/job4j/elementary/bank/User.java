package ru.job4j.elementary.bank;
import java.util.Objects;

/**
 * Класс описывает объекты класса User.
 * Класс имеет два поля String passport и String username
 */
public class User {
    private String passport;
    private String username;
    /**
     * Конкруктор класса User с двумя параметрами
     *
     * @param passport
     * @param username
     */

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }
    /**
     * Метод позволяет получить значение поля passport
     *
     * @return String
     */

    public String getPassport() {
        return passport;
    }
    /**
     * Метод позволяет задать значение поля passport
     *
     * @param passport
     */

    public void setPassport(String passport) {
        this.passport = passport;
    }
    /**
     * Метод позволяет получить значение поля UserName
     *
     * @return
     */

    public String getUsername() {
        return username;
    }
    /**
     * Метод позволяет задать значение поля UserName
     *
     * @param username
     */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Перегруженный метод для сравнения двух объектов класса.
     *
     * @param o
     * @return boolean
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }
    /**
     * Перегруженный метод для сравнения двух объектов класса через hashCode.
     *
     * @return
     */

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
