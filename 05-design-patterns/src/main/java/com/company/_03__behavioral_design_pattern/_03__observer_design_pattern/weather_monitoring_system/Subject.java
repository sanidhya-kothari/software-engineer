package com.company._03__behavioral_design_pattern._03__observer_design_pattern.weather_monitoring_system;

interface Subject {

	void subscribe(Observer observer);

	void unsubscribe(Observer observer);

	void notifyObservers();

}
