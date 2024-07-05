package com.company._05__dependency_inversion_principle.pc;

public class Computer {

	private final Keyboard keyboard;
	private final Mouse mouse;

	public Computer(Keyboard keyboard, Mouse mouse) {
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

}
