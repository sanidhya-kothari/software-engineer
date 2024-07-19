package com.company._03__behavioral_design_pattern._02__command_design_pattern;

public class CommandTurnOff implements Command {

	private Receiver receiver;

	public CommandTurnOff(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.turnOff();
	}

}