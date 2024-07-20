package com.company._03__behavioral_design_pattern._03__observer_design_pattern.notification_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublisherNotification implements Publisher {

	private static Map<EventType, List<Listener>> mapListener;

	public PublisherNotification() {
		PublisherNotification.mapListener = new HashMap<>();
	}

	@Override
	public void subscribe(EventType type, Listener listener) {
		if (!mapListener.containsKey(type)) {
			mapListener.put(type, new ArrayList<>());
		}
		mapListener.get(type).add(listener);
	}

	@Override
	public void unsubscribe(EventType type, Listener listener) {
		if (!mapListener.containsKey(type)) {
			throw new IllegalArgumentException("you have not subscribed the publisher");
		} else {
			mapListener.get(type).remove(listener);
		}
	}

	@Override
	public void notifyObservers() {
		for (EventType type : mapListener.keySet()) {
			List<Listener> listeners = mapListener.get(type);
			for (Listener listener : listeners) {
				listener.update(type);
			}
		}
	}

	@Override
	public void notifyObservers(EventType type) {
		List<Listener> users = mapListener.get(type);
		for (Listener user : users) {
			user.update(type);
		}
	}

	@Override
	public void setLiveUpdate(EventType type, String liveUpdate) {
		List<Listener> users = mapListener.get(type);
		for (Listener user : users) {
			user.liveUpdate(type, liveUpdate);
		}
	}

}
