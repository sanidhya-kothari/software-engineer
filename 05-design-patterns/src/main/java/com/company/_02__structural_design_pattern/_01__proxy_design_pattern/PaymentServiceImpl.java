package com.company._02__structural_design_pattern._01__proxy_design_pattern;

import java.math.BigDecimal;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public String payment(Account from, Account to, BigDecimal amount) {
		from.setBalance(from.getBalance().subtract(amount));
		to.setBalance(to.getBalance().add(amount));
		return "payment status: success";
	}

}
