package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.atc_system;

import java.util.UUID;

public interface ColleagueAirplane {

	public abstract void requestTakeOff();

	public abstract void requestLanding();

	public abstract void contactAirTrafficControl(String message);

	public abstract UUID getId();

	public abstract String getName();

}
