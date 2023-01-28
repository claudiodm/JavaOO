package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Heranca1202 {
    public static void main(String[] args) {
        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        acc1.deposit(1000.00);

        Account acc2 = new BusinessAccount(1003,"BOB", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0,0.01);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0); //atributo de BusinessAccount

       // BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount){//esse if falha, pois acc3 não é instancia de bussinessAccount
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan acc5");
        }
        else{
            System.out.println("primeiro if falhou pois ACC3 não é instância de BusinessAccount!!!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE acc5");
        }

        // Sobreposição
        Account cc1 = new Account(1001,"Claudio",1000.00);
        cc1.withdraw(200.0);
        System.out.println(cc1.getBalance());

        Account cc2 = new SavingsAccount(1002,"Claudio",1000.00,0.01);
        cc2.withdraw(200.0);
        System.out.println(cc2.getBalance());

        Account cc3 = new BusinessAccount(1003,"Claudio",1000.00,500.00);
        cc3.withdraw(200.0);
        System.out.println(cc3.getBalance());



    }
}
