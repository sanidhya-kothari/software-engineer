package com.company._03__behavioral_design_pattern._07__template_design_pattern;

public class TemplateAlgorithmBest implements TemplateAlgorithm {

	@Override
	public void activate() {
		try {
			Thread.sleep(1000);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		System.out.println("activated best algorithm");
	}

	@Override
	public void logic() {
		System.out.println("performing best algorithm");
	}

	@Override
	public void deactivate() {
		System.out.println("deactivated best algorithm");
	}

}