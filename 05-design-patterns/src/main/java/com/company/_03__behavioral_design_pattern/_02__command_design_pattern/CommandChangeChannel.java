package com.company._03__behavioral_design_pattern._02__command_design_pattern;

public class CommandChangeChannel implements Command {

	private Receiver receiver;

	public CommandChangeChannel(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.changeChannel();
	}

}