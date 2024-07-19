package com.company._03__behavioral_design_pattern._02__command_design_pattern;

public class CommandAdjustVolume implements Command {

	private Receiver receiver;

	public CommandAdjustVolume(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.adjustVolume();
	}

}