package com.company._03__behavioral_design_pattern._02__command_design_pattern;

import java.util.List;
import java.util.ArrayList;

public class Invoker {

	private List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void removeCommand(Command command) {
		commands.remove(command);
	}

	public void executeAll() {
		commands.forEach(Command::execute);
		commands.clear();
	}

}
