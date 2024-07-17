package com.company._02__structural_design_pattern._07__flyweight_design_pattern;

public class FlyweightIconIconFolder implements FlyweightIcon {

	private String color;
	private String imageName;

	public FlyweightIconIconFolder(String color, String imageName) {
		this.color = color;
		this.imageName = imageName;
		try {
			Thread.sleep(1000);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public void draw(int x, int y) {
		System.out.println("drawing folder icon " + imageName + " of color " + color + " at location ( " + x + ", " + y + " )");
	}

}