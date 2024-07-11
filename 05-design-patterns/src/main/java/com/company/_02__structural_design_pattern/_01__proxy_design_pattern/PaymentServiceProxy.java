package com.company._02__structural_design_pattern._01__proxy_design_pattern;

import java.math.BigDecimal;

public class PaymentServiceProxy implements PaymentService {

	private PaymentService paymentService;

	public PaymentServiceProxy(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public String payment(Account from, Account to, BigDecimal amount) {
		if (from.getBalance().compareTo(amount) >= 0) {
			return paymentService.payment(from, to, amount);
		}
		throw new IllegalArgumentException("payment status: failure");
	}

}
