package com.company._01__creational_design_pattern._02__prototype_design_pattern;

import java.util.Map;
import java.util.HashMap;

public class VehicleRegistry {

	private static Map<String, Vehicle> map = new HashMap<>();

	static {
		map.put("two", new VehicleWheelerTwo("honda", "hornet v2.0", "100", true, false, true));
		map.put("four", new VehicleWheelerFour("ford", "mustang rtr", "1000", false, true, false, false, true, false));
	}

	public Vehicle getVehicle(String key) throws CloneNotSupportedException {
		return map.get(key).clone();
	}

}
