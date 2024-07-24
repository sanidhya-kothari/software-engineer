package com.company._03__behavioral_design_pattern._07__template_design_pattern;

public interface TemplateAlgorithm {

	public default void executeTemplate() {
		activate();
		logic();
		deactivate();
	}

	public abstract void activate();

	public abstract void logic();

	public abstract void deactivate();

}
