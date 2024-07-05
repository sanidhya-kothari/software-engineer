package com.company._05__dependency_inversion_principle.pc;

import java.util.Map;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Map<String, Computer> map = new HashMap<>();
		map.put("computer-1", new Computer(new KeyboardLogitech(), new MouseLogitech()));
		map.put("computer-2", new Computer(new KeyboardRazer(), new MouseRazer()));
		map.put("computer-3", new Computer(new KeyboardLogitech(), new MouseRazer()));
		map.put("computer-4", new Computer(new KeyboardRazer(), new MouseLogitech()));
		System.out.println(map);
	}

}
