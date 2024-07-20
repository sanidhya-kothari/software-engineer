package com.company._03__behavioral_design_pattern._03__observer_design_pattern.notification_system;

public class ListenerMail implements Listener {

	private String mail;

	public ListenerMail(String mail) {
		this.mail = mail;
	}

	@Override
	public void update(EventType type) {
		System.out.println("subscriber with mail (" + mail + ") has been notified regarding " + type.toString().toLowerCase() + " via mail");
	}

	@Override
	public void liveUpdate(EventType type, String message) {
		System.out.println("subscriber with mail (" + mail + ") has been notified regarding " + type.toString().toLowerCase() + " via mail");
		System.out.println("(live) - " + message);
	}

}