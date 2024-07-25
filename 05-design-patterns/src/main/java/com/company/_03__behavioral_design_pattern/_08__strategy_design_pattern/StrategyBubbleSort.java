package com.company._03__behavioral_design_pattern._08__strategy_design_pattern;

public class StrategyBubbleSort implements Strategy {

	@Override
	public void sort(int[] array) {
		System.out.println("bubble sort");
	}

}