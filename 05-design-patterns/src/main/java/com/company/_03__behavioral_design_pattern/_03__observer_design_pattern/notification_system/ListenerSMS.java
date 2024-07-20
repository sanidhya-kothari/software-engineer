package com.company._03__behavioral_design_pattern._03__observer_design_pattern.notification_system;

public class ListenerSMS implements Listener {

	private String contactNumber;

	public ListenerSMS(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public void update(EventType type) {
		System.out.println("subscriber with contact number (" + contactNumber + ") has been notified regarding " + type.toString().toLowerCase() + " via sms");
	}

	@Override
	public void liveUpdate(EventType type, String message) {
		System.out.println("subscriber with contact number (" + contactNumber + ") has been notified regarding " + type.toString().toLowerCase() + " via sms");
		System.out.println("(live) - " + message);
	}

}
