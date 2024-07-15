package com.company._02__structural_design_pattern._05__bridge_design_pattern.video;

import com.company._02__structural_design_pattern._05__bridge_design_pattern.quality.Quality;

public abstract class Video {

	protected Quality quality;

	public Video(Quality quality) {
		this.quality = quality;
	}

	public abstract void playVideo(String title);

}