package com.company._03__behavioral_design_pattern._07__template_design_pattern;

public class TemplateAlgorithmBetter implements TemplateAlgorithm {

	@Override
	public void activate() {
		try {
			Thread.sleep(2000);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		System.out.println("activated better algorithm");
	}

	@Override
	public void logic() {
		System.out.println("performing better algorithm");
	}

	@Override
	public void deactivate() {
		System.out.println("deactivated better algorithm");
	}

}