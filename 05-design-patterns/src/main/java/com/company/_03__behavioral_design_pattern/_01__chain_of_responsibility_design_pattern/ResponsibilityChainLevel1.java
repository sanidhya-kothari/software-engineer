package com.company._03__behavioral_design_pattern._01__chain_of_responsibility_design_pattern;

public class ResponsibilityChainLevel1 implements Responsibility {

	private Responsibility nextResponsibility;

	@Override
	public Responsibility getNextResponsibility() {
		return nextResponsibility;
	}

	@Override
	public void setNextResponsibility(Responsibility nextResponsibility) {
		this.nextResponsibility = nextResponsibility;
	}

	@Override
	public void handleResponsibility(Request request) {
		if (request.getPriority() == Priority.BASIC) {
			System.out.println("level-1 support team is handling '" + request.getMessage() + "'");
		} else {
			nextResponsibility.handleResponsibility(request);
		}
	}

}