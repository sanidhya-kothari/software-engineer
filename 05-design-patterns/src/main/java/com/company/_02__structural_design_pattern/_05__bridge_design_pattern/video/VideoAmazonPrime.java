package com.company._02__structural_design_pattern._05__bridge_design_pattern.video;

import com.company._02__structural_design_pattern._05__bridge_design_pattern.quality.Quality;

public class VideoAmazonPrime extends Video {

	public VideoAmazonPrime(Quality quality) {
		super(quality);
	}

	@Override
	public void playVideo(String title) {
		System.out.println(quality.setQuality(title));
	}

}