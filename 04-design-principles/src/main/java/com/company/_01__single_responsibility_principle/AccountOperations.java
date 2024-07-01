package com.company._01__single_responsibility_principle;

import java.util.Map;
import java.util.HashMap;
import java.util.UUID;
import java.util.Optional;
import java.util.Objects;

public class AccountOperations {

	// note:
	// here the instance of HashMap is static,
	// so each time a new object of AccountOperations class is created will share the same HashMap
	// if we do not use static keyword then for each new object of AccountOperations class, a new HashMap will be created
	private static Map<UUID, Account> map = new HashMap<>();

	public Optional<Account> createAccount(Account account) {
		if (Objects.isNull(map.get(account.getId()))) {
			return Optional.ofNullable(map.put(account.getAccountNumber(), account));
		} else {
			throw new RuntimeException("credentials already exist");
		}
	}

	public Optional<Account> readAccount(UUID accountNumber) {
		if (Objects.nonNull(map.get(accountNumber))) {
			return Optional.of(map.get(accountNumber));
		} else {
			throw new RuntimeException("credentials does not exist");
		}
	}

	public Optional<Account> updateAccount(Account account) {
		if (Objects.nonNull(map.get(account.getId()))) {
			return Optional.of(map.put(account.getId(), account));
		} else {
			throw new RuntimeException("credentials does not exist");
		}
	}

	public String deleteAccount(UUID accountNumber) {
		if (Objects.nonNull(map.get(accountNumber))) {
			map.remove(accountNumber);
			return "deleted successfully";
		} else {
			throw new RuntimeException("credentials does not exist");
		}
	}

	// Bad Practice
	// public BigDecimal deposit(UUID accountNumber, BigDecimal amount);
	// public BigDecimal withdraw(UUID accountNumber, BigDecimal amount);
	// public String transfer(UUID senderAccountNumber, UUID receiverAccountNumber, BigDecimal amount);

}
