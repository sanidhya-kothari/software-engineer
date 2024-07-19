package com.company._03__behavioral_design_pattern._02__command_design_pattern;

public class Main {

	public static void main(String[] args) {

		Invoker invoker = new Invoker();

		invoker.addCommand(new CommandTurnOn(new Receiver()));
		invoker.addCommand(new CommandChangeChannel(new Receiver()));
		invoker.addCommand(new CommandAdjustVolume(new Receiver()));
		invoker.addCommand(new CommandTurnOff(new Receiver()));

		invoker.executeAll();

	}

}