package com.company._01__single_responsibility_principle;

import java.util.Optional;
import java.util.UUID;
import java.math.BigDecimal;

public class TransactionOperations {

    private AccountOperations accountOperations;

    public TransactionOperations(AccountOperations accountOperations) {
        this.accountOperations = accountOperations;
    }

    public void deposit(UUID accountNumber, BigDecimal amount) {
        Optional<Account> optional = accountOperations.readAccount(accountNumber);
        if (optional.isPresent()) {
            optional.get().setBalance(optional.get().getBalance().add(amount));
        } else {
            throw new RuntimeException("invalid credentials");
        }
    }

    public void withdraw(UUID accountNumber, BigDecimal amount) {
        Optional<Account> optional = accountOperations.readAccount(accountNumber);
        if (optional.isPresent()) {
            optional.get().setBalance(optional.get().getBalance().subtract(amount));
        } else {
            throw new RuntimeException("invalid credentials");
        }
    }

    public String transfer(UUID senderAccountNumber, UUID receiverAccountNumber, BigDecimal amount) {
        Optional<Account> optionalSender = accountOperations.readAccount(senderAccountNumber);
        Optional<Account> optionalReceiver = accountOperations.readAccount(receiverAccountNumber);
        if (optionalSender.isPresent() && optionalReceiver.isPresent()) {
            if (optionalSender.get().getBalance().compareTo(amount) >= 0) {
                withdraw(senderAccountNumber, amount);
                deposit(receiverAccountNumber, amount);
                return "transfer successful";
            } else {
                throw new RuntimeException("in-sufficient funds");
            }
        } else {
            throw new RuntimeException("invalid credentials");
        }
    }

}
