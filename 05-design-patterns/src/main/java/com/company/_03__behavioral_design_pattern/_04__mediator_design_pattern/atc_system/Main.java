package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.atc_system;

import java.util.UUID;

public class Main {

	public static void main(String[] args) {

		MediatorAirTrafficControl mediatorATC = new MediatorAirTrafficControlImpl();

		ColleagueAirplane airplane1 = new ColleagueAirplaneImpl(mediatorATC, UUID.randomUUID(), "air amigo");
		ColleagueAirplane airplane2 = new ColleagueAirplaneImpl(mediatorATC, UUID.randomUUID(), "air comrade");

		mediatorATC.addColleagueAirplane(airplane1);
		mediatorATC.addColleagueAirplane(airplane2);

		airplane1.requestTakeOff();
		airplane2.requestLanding();

	}

}
