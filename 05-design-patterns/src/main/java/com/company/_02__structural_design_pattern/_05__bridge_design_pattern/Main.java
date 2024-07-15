package com.company._02__structural_design_pattern._05__bridge_design_pattern;

import com.company._02__structural_design_pattern._05__bridge_design_pattern.quality.Quality4K;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.quality.Quality8K;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.quality.QualityHD;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.quality.QualityUHD;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.video.Video;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.video.VideoAmazonPrime;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.video.VideoHotstar;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.video.VideoNetflix;
import com.company._02__structural_design_pattern._05__bridge_design_pattern.video.VideoYouTube;

public class Main {

	public static void main(String[] args) {

		Video youtube = new VideoYouTube(new QualityHD());
		youtube.playVideo("ghost recon wildlands");

		Video netflix = new VideoNetflix(new Quality8K());
		netflix.playVideo("ghost of tsushima");

		Video amazonPrime = new VideoAmazonPrime(new Quality4K());
		amazonPrime.playVideo("forza horizon");

		Video hotstar = new VideoHotstar(new QualityUHD());
		hotstar.playVideo("red dead redemption");

	}

}
