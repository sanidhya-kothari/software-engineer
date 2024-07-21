package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.atc_system;

import java.util.ArrayList;
import java.util.List;

public class MediatorAirTrafficControlImpl implements MediatorAirTrafficControl {

	private List<ColleagueAirplane> airplanes;

	public MediatorAirTrafficControlImpl() {
		this.airplanes = new ArrayList<>();
	}

	@Override
	public void requestTakeOff(ColleagueAirplane airplane) {
		airplane.contactAirTrafficControl(airplane.getName() + " is requesting to take off");
	}

	@Override
	public void requestLanding(ColleagueAirplane airplane) {
		airplane.contactAirTrafficControl(airplane.getName() + " is requesting for landing");
	}

	@Override
	public void addColleagueAirplane(ColleagueAirplane airplane) {
		this.airplanes.add(airplane);
	}

}
