package com.company._02__structural_design_pattern._05__bridge_design_pattern.quality;

public class Quality4K implements Quality {

	@Override
	public String setQuality(String title) {
		return "playing " + title + " in 4K quality";
	}

}