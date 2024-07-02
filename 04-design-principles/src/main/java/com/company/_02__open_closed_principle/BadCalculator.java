package com.company._02__open_closed_principle;

import java.math.BigDecimal;

public class BadCalculator {

	public BigDecimal calculate(BigDecimal a, BigDecimal b, String operation) {
		switch (operation) {
			case "division": {
				return a.divide(b);
			}
			case "multiplication": {
				return a.multiply(b);
			}
			case "addition": {
				return a.add(b);
			}
			case "subtraction": {
				return a.subtract(b);
			}
			default: {
				throw new RuntimeException("invaild details");
			}
		}

	}

}
