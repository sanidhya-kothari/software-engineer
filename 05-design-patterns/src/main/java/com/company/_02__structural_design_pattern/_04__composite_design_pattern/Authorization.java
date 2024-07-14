package com.company._02__structural_design_pattern._04__composite_design_pattern;

import java.util.UUID;

public interface Authorization {

	public abstract UUID getId();

	public abstract String getName();

	public abstract void getIdentity();

}
