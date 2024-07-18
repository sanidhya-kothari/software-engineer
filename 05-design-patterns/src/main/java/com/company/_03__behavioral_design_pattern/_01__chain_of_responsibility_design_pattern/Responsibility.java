package com.company._03__behavioral_design_pattern._01__chain_of_responsibility_design_pattern;

public interface Responsibility {

	public Responsibility getNextResponsibility();

	public void setNextResponsibility(Responsibility nextResponsibility);

	public abstract void handleResponsibility(Request request);

}
