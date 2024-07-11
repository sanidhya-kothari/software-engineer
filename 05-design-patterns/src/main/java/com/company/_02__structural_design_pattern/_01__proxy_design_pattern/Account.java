package com.company._02__structural_design_pattern._01__proxy_design_pattern;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {

	private UUID id;
	private String accountNumber;
	private String firstName;
	private String lastName;
	private BigDecimal balance;

	private Account(AccountBuilder accountBuilder) {
		this.id = accountBuilder.id;
		this.accountNumber = accountBuilder.accountNumber;
		this.firstName = accountBuilder.firstName;
		this.lastName = accountBuilder.lastName;
		this.balance = accountBuilder.balance;
	}

	public static class AccountBuilder {
		private UUID id;
		private String accountNumber;
		private String firstName;
		private String lastName;
		private BigDecimal balance;

		public Account build() {
			return new Account(this);
		}

		public AccountBuilder id(UUID id) {
			this.id = id;
			return this;
		}

		public AccountBuilder accountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public AccountBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public AccountBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public AccountBuilder balance(BigDecimal balance) {
			this.balance = balance;
			return this;
		}

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
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
		return "Account -> [ id=" + id + ", accountNumber=" + accountNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance + " ]";
	}

}
