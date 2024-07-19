package com.company._03__behavioral_design_pattern._02__command_design_pattern;

public class Receiver {

	public void turnOn() {
		System.out.println("device turned on");
	}

	public void turnOff() {
		System.out.println("device turned off");
	}

	public void changeChannel() {
		System.out.println("device channel changed");
	}

	public void adjustVolume() {
		System.out.println("device volume adjusted");
	}

}