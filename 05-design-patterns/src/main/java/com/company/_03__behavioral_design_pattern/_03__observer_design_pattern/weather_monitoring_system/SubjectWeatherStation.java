package com.company._03__behavioral_design_pattern._03__observer_design_pattern.weather_monitoring_system;

import java.util.List;
import java.util.ArrayList;

class SubjectWeatherStation implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private String weather;

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(weather);
		}
	}

	public void setWeather(String newWeather) {
		this.weather = newWeather;
		notifyObservers();
	}

}