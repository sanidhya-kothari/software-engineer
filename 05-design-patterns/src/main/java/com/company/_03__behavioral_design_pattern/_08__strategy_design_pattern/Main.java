package com.company._03__behavioral_design_pattern._08__strategy_design_pattern;

public class Main {

	public static void main(String[] args) {

		Context context = new Context();

		context.setStrategy(new StrategyBubbleSort());
		context.execute(new int[] { 1, 2, 3, 4, 5 });

		context.setStrategy(new StrategyQuickSort());
		context.execute(new int[] { 1, 2, 3, 4, 5 });

		context.setStrategy(new StrategyMergeSort());
		context.execute(new int[] { 1, 2, 3, 4, 5 });

	}

}
