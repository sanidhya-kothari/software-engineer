package com.company._03__behavioral_design_pattern._03__observer_design_pattern.weather_monitoring_system;

public class ObserverTelevision implements Observer {

	private String weather;

	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}

	private void display() {
		System.out.println("TV Display: Weather updated - " + weather);
	}

}