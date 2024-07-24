package com.company._03__behavioral_design_pattern._07__template_design_pattern;

public class TemplateAlgorithmGood implements TemplateAlgorithm {

	@Override
	public void activate() {
		try {
			Thread.sleep(3000);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		System.out.println("activated good algorithm");
	}

	@Override
	public void logic() {
		System.out.println("performing good algorithm");
	}

	@Override
	public void deactivate() {
		System.out.println("deactivated good algorithm");
	}

}