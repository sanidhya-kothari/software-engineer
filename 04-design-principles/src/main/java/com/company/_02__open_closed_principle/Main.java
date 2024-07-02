package com.company._02__open_closed_principle;

import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Map<String, BigDecimal> map = new HashMap<>();
		map.put("divide", new GoodCalculator().calculate(new BigDecimal(4), new BigDecimal(2), new OperationDivide()));
		map.put("multiply", new GoodCalculator().calculate(new BigDecimal(4), new BigDecimal(2), new OperationMultiply()));
		map.put("add", new GoodCalculator().calculate(new BigDecimal(4), new BigDecimal(2), new OperationAdd()));
		map.put("subtract", new GoodCalculator().calculate(new BigDecimal(4), new BigDecimal(2), new OperationSubtract()));
		System.out.println(map);
	}

}
