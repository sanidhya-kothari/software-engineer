package com.company._02__open_closed_principle;

import java.math.BigDecimal;

public class OperationAdd implements Operation {

	@Override
	public BigDecimal perform(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}

}
