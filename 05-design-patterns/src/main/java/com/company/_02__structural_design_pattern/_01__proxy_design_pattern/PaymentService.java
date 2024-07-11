package com.company._02__structural_design_pattern._01__proxy_design_pattern;

import java.math.BigDecimal;

public interface PaymentService {

	public abstract String payment(Account from, Account to, BigDecimal amount);

}
