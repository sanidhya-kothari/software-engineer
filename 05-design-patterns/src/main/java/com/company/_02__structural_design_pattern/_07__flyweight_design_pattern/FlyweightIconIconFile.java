package com.company._02__structural_design_pattern._07__flyweight_design_pattern;

public class FlyweightIconIconFile implements FlyweightIcon {

	private String type;
	private String imageName;

	public FlyweightIconIconFile(String type, String imageName) {
		this.type = type;
		this.imageName = imageName;
		try {
			Thread.sleep(1000);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public void draw(int x, int y) {
		System.out.println("drawing file icon " + imageName + " of type " + type + " at location ( " + x + ", " + y + " )");
	}

}