package ru.job4j.bank;
import java.util.Objects;

/**
 * Класс описывает объекты класса Account.
 * Содержит 2 поля String requisite и double balance
 *
 */

public class Account {
    /**
     * Хранение реквизитов осуществляется в переменной requisite
     * Хранение реквизитов осуществляется в переменной balance
     */

    private String requisite;
    private double balance;
    /**
     * Конструктор с 2 параметрами.
     * @param requisite
     * @param balance
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }
    /**
     * Метод позволяет получить переменную объекта - requisite
     * @return requisite
     */

    public String getRequisite() {
        return requisite;
    }
    /**
     * Метод позволяет задать значение переменную объекта - requisite
     * @param requisite
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }
    /**
     * Метод позволяет получить переменную объекта - balance.
     * @return balance
     */

    public double getBalance() {
        return balance;
    }
    /**
     * Метод позволяет задать значение переменную объекта - balance
     *
     * @param balance
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Перегруженный метод для сравнения 2 объектов класса
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }
    /**
     * Перегруженный метод для сравнения двух объектов класса через hashCode.
     * @return
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
