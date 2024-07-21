package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.atc_system;

import java.util.UUID;

public class ColleagueAirplaneImpl implements ColleagueAirplane {

	private MediatorAirTrafficControl mediatorAirTrafficControl;
	private UUID id;
	private String name;

	public ColleagueAirplaneImpl(MediatorAirTrafficControl mediatorAirTrafficControl, UUID id, String name) {
		this.mediatorAirTrafficControl = mediatorAirTrafficControl;
		this.id = id;
		this.name = name;
	}

	@Override
	public void requestTakeOff() {
		mediatorAirTrafficControl.requestTakeOff(this);
	}

	@Override
	public void requestLanding() {
		mediatorAirTrafficControl.requestLanding(this);
	}

	@Override
	public void contactAirTrafficControl(String message) {
		System.out.println(message);
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
