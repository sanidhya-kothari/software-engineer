package com.company._03__behavioral_design_pattern._03__observer_design_pattern.weather_monitoring_system;

public class Main {

	public static void main(String[] args) {

		SubjectWeatherStation weatherStation = new SubjectWeatherStation();

		Observer display1 = new ObserverPhone();
		Observer display2 = new ObserverPhone();
		Observer display3 = new ObserverTelevision();
		Observer display4 = new ObserverTelevision();
		Observer display5 = new ObserverTelevision();

		System.out.println("after subscribing");
		weatherStation.subscribe(display1);
		weatherStation.subscribe(display2);
		weatherStation.subscribe(display3);
		weatherStation.subscribe(display4);
		weatherStation.subscribe(display5);
		// Simulating weather change
		weatherStation.setWeather("sunny");

		System.out.println("after unsubscribing");
		weatherStation.unsubscribe(display2);
		weatherStation.unsubscribe(display3);
		// Simulating weather change
		weatherStation.setWeather("rainy");

	}

}
