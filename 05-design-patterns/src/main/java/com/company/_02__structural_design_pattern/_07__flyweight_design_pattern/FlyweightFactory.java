package com.company._02__structural_design_pattern._07__flyweight_design_pattern;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class FlyweightFactory {

	private static Map<String, FlyweightIcon> cache;

	public FlyweightFactory() {
		cache = new HashMap<>();
	}

	public FlyweightIcon getIcon(String type) {
		FlyweightIcon icon = cache.get(type);
		if (Objects.isNull(icon)) {
			switch (type) {
				case "file":
					icon = new FlyweightIconIconFile("document", "file.png");
					break;
				case "folder":
					icon = new FlyweightIconIconFolder("yellow", "folder.png");
					break;
				default:
					throw new IllegalArgumentException("invalid value");
			}
			cache.put(type, icon);
		}
		return icon;
	}

}