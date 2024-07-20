package com.company._03__behavioral_design_pattern._03__observer_design_pattern.notification_system;

public interface Publisher {

	public abstract void subscribe(EventType type, Listener listener);

	public abstract void unsubscribe(EventType type, Listener listener);

	public abstract void notifyObservers();

	public abstract void notifyObservers(EventType type);

	public void setLiveUpdate(EventType type, String liveUpdate);

}
