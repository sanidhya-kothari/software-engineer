package com.company._03__behavioral_design_pattern._08__strategy_design_pattern;

public class StrategyMergeSort implements Strategy {

	@Override
	public void sort(int[] array) {
		System.out.println("merge sort");
	}

}