package com.company._03__behavioral_design_pattern._01__chain_of_responsibility_design_pattern;

public class ResponsibilityChainNoSupport implements Responsibility {

	@Override
	@Deprecated
	public Responsibility getNextResponsibility() {
		return null;
	}

	@Override
	@Deprecated
	public void setNextResponsibility(Responsibility nextResponsibility) {
		throw new RuntimeException();
	}

	@Override
	public void handleResponsibility(Request request) {
		throw new RuntimeException("'" + request.getMessage() + "' can not be handled");
	}

}