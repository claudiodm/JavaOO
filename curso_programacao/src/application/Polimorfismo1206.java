package application;

import entities.Account;
import entities.SavingsAccount;

public class Polimorfismo1206 {
    public static void main(String[] args) {
        Account c = new Account(1001, "claudio",100.0);
        Account b = new SavingsAccount(1002, "claudio",100.0, 0.01);

        c.withdraw(50.0);
        b.withdraw(50.0);

        System.out.println(c.getBalance());
        System.out.println(b.getBalance());
    }
}
