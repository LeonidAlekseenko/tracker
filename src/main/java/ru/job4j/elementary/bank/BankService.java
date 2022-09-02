package ru.job4j.elementary.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает действия с объектами User и Account.
 * Класс имеет поле users, которое хранит
 * в себе данные о пользователях(User) и их счетах(Account).
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    /**
     * Метод позволяет добавить объект класса User в поле users,
     * класса BankService
     * @param user
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }
    /**
     * Метод позволяет добавить объект класса Account
     * по отношению к конкретному User.
     *
     * @param passport
     * @param account
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }
    /**
     * Метод проверяет наличие пользователя в системе по его паспорту
     *
     * @param passport
     * @return возвращает пользователя или null если такого пользователя нет
     */

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }
    /**
     * Метод ищет счет пользователя по реквизитам счета и паспорту пользователя
     *
     * @param passport
     * @param requisite
     * @return возвращает счет пользователя или null если такого счета нет
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> listAccounts = users.get(user);
                for (Account account : listAccounts) {
                    if (account.getRequisite().equals(requisite)) {
                        return account;
                    }
                }
           }
        return null;
    }
    /**
     * Метод позволяет осуществить перевод денежных средств
     * с одного объекта класса Account к другому.
     *
     * @param srcPassport   - паспорт User от которого будет осуществляться перевод
     * @param srcRequisite  - реквизиты конкретного объекта класса Account.
     *                      Счет откуда будут списываться деньги
     * @param destPassport  - паспорт User которому будет осуществляться перевод
     * @param destRequisite - реквизиты конкретного объекта класса Account.
     *                      Счет на который будут зачисляться деньги
     * @param amount        - сумма которую необходимо перевести.
     * @return boolean - в случае успешного перевода,
     * метод возвращает true. В случае неудачного перевода
     * метод вернет false.
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account firstAccount = findByRequisite(srcPassport, srcRequisite);
        Account secondAccount = findByRequisite(destPassport, destRequisite);
        if (firstAccount != null && secondAccount != null && firstAccount.getBalance() >= amount) {
            firstAccount.setBalance(firstAccount.getBalance() - amount);
            secondAccount.setBalance(secondAccount.getBalance() + amount);
            return true;
        }
        return false;
    }
}