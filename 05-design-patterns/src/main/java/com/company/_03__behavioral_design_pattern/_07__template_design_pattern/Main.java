package com.company._03__behavioral_design_pattern._07__template_design_pattern;

public class Main {

	public static void main(String[] args) {

		TemplateAlgorithm good = new TemplateAlgorithmGood();
		TemplateAlgorithm better = new TemplateAlgorithmBetter();
		TemplateAlgorithm best = new TemplateAlgorithmBest();

		good.executeTemplate();
		better.executeTemplate();
		best.executeTemplate();

	}

}
