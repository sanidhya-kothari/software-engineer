package com.company._01__single_responsibility_principle;

import java.util.UUID;
import java.math.BigDecimal;

public class Account {

	private UUID id;
	private UUID accountNumber;
	private String firstName;
	private String lastName;
	private BigDecimal balance;

	public Account() {

	}

	public Account(UUID id, UUID accountNumber, String firstName, String lastName, BigDecimal balance) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(UUID accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account {" +
		      "\n id : " + id +
		      ",\n accountNumber : " + accountNumber +
		      ",\n firstName : " + firstName +
		      ",\n lastName : " + lastName +
		      ",\n balance : " + balance +
		      "\n}";
	}

}
