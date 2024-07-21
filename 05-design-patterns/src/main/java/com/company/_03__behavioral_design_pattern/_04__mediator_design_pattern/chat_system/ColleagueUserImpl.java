package com.company._03__behavioral_design_pattern._04__mediator_design_pattern.chat_system;

public class ColleagueUserImpl implements ColleagueUser {

	private String name;
	private Mediator mediator;

	public ColleagueUserImpl(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	@Override
	public void send(String message, ColleagueUser toUser) {
		System.out.println(name + " - sent : " + message);
		mediator.sent(message, toUser);
	}

	public void sendAll(String message) {
		System.out.println(name + " - sent : " + message);
		mediator.sentAll(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(name + " - received : " + message);
	}

}
