package com.company._03__behavioral_design_pattern._03__observer_design_pattern.notification_system;

public class Main {

	public static void main(String[] args) {

		Publisher publisher = new PublisherNotification();

		Listener user1 = new ListenerMail("user1@mail");
		Listener user2 = new ListenerSMS("user2@mail");
		Listener user3 = new ListenerSMS("user3@mail");
		Listener user4 = new ListenerMail("user4@mail");
		Listener user5 = new ListenerMail("user5@mail");
		Listener user6 = new ListenerSMS("user6@mail");
		Listener user7 = new ListenerMail("user7@mail");
		Listener user8 = new ListenerSMS("user8@mail");
		Listener user9 = new ListenerMail("user9@mail");
		Listener user10 = new ListenerSMS("user10@mail");

		publisher.subscribe(EventType.SECURITY, user1);
		publisher.subscribe(EventType.SECURITY, user2);
		publisher.subscribe(EventType.SECURITY, user3);
		publisher.subscribe(EventType.PERFORMANCE, user4);
		publisher.subscribe(EventType.PERFORMANCE, user5);
		publisher.subscribe(EventType.REAL_TIME, user6);
		publisher.subscribe(EventType.LIVE, user7);
		publisher.subscribe(EventType.LIVE, user8);
		publisher.subscribe(EventType.LIVE, user9);
		publisher.subscribe(EventType.LIVE, user10);

		System.out.println("notify all subscribers");
		publisher.notifyObservers();
		System.out.println();

		System.out.println("notify all subscribers for live updates");
		publisher.setLiveUpdate(EventType.LIVE, "emergency");
		System.out.println();

		System.out.println("notify all subscribers with key real_time");
		publisher.notifyObservers(EventType.REAL_TIME);
		System.out.println();

		System.out.println("notify all subscribers with key security");
		publisher.notifyObservers(EventType.SECURITY);
		System.out.println();

		System.out.println("notify all subscribers with key performance");
		publisher.notifyObservers(EventType.PERFORMANCE);
		System.out.println();

		System.out.println("notify all after unsubscribing security");
		publisher.unsubscribe(EventType.SECURITY, user1);
		publisher.unsubscribe(EventType.SECURITY, user2);
		publisher.unsubscribe(EventType.SECURITY, user3);
		publisher.notifyObservers();
		System.out.println();

		System.out.println("notify all after unsubscribing performance");
		publisher.unsubscribe(EventType.PERFORMANCE, user4);
		publisher.unsubscribe(EventType.PERFORMANCE, user5);
		publisher.notifyObservers();
		System.out.println();

		System.out.println("notify all after unsubscribing real_time");
		publisher.unsubscribe(EventType.REAL_TIME, user6);
		publisher.notifyObservers();
		System.out.println();

	}

}
