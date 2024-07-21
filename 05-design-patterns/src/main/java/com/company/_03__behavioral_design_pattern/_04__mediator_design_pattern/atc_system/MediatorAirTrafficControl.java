package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.atc_system;

public interface MediatorAirTrafficControl {

	public abstract void requestTakeOff(ColleagueAirplane airplane);

	public abstract void requestLanding(ColleagueAirplane airplane);

	public abstract void addColleagueAirplane(ColleagueAirplane airplane);

}
