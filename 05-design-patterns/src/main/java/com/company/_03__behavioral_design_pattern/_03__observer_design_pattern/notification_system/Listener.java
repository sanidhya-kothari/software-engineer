package com.company._03__behavioral_design_pattern._03__observer_design_pattern.notification_system;

public interface Listener {

	public abstract void update(EventType type);

	public abstract void liveUpdate(EventType type, String message);

}
