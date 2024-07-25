package com.company._03__behavioral_design_pattern._08__strategy_design_pattern;

public class Context {

	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void execute(int[] array) {
		strategy.sort(array);
	}

}
