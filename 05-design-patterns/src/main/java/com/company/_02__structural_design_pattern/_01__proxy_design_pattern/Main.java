package com.company._02__structural_design_pattern._01__proxy_design_pattern;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account.AccountBuilder().id(UUID.randomUUID()).accountNumber(UUID.randomUUID().toString()).firstName("john").lastName("doe").balance(new BigDecimal(1000)).build();
		Account account2 = new Account.AccountBuilder().id(UUID.randomUUID()).accountNumber(UUID.randomUUID().toString()).firstName("john").lastName("black").balance(new BigDecimal(1000)).build();

		System.out.println(account1);
		System.out.println(account2);

		PaymentService proxy = new PaymentServiceProxy(new PaymentServiceImpl());
		proxy.payment(account1, account2, new BigDecimal(500));

		System.out.println(account1);
		System.out.println(account2);

	}

}
