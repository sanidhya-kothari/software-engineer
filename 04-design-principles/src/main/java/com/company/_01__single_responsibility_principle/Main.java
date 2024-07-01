package com.company._01__single_responsibility_principle;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(UUID.randomUUID(), UUID.randomUUID(), "john", "doe", new BigDecimal(1000));
        Account account2 = new Account(UUID.randomUUID(), UUID.randomUUID(), "luther", "cage", new BigDecimal(1000));
        new AccountOperations().createAccount(account1);
        new AccountOperations().createAccount(account2);
        TransactionOperations transactionOperations = new TransactionOperations(new AccountOperations());
        transactionOperations.deposit(account1.getAccountNumber(), new BigDecimal(500));
        System.out.println(account1.toString());
        transactionOperations.withdraw(account2.getAccountNumber(), new BigDecimal(500));
        System.out.println(account2.toString());
        transactionOperations.transfer(account1.getAccountNumber(), account2.getAccountNumber(), new BigDecimal(500));
        System.out.println(account1.toString());
        System.out.println(account2.toString());

    }

}
