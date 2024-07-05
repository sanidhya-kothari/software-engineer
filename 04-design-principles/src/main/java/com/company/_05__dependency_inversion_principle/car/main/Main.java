package com.company._05__dependency_inversion_principle.car.main;

import com.company._05__dependency_inversion_principle.car.factory.SpeakerFactory;
import com.company._05__dependency_inversion_principle.car.factory.TyreFactory;
import com.company._05__dependency_inversion_principle.car.model.speakers_brand.SonySpeakers;
import com.company._05__dependency_inversion_principle.car.model.speakers_brand.Speakers;
import com.company._05__dependency_inversion_principle.car.model.tyres_brand.MichelinTyres;
import com.company._05__dependency_inversion_principle.car.model.tyres_brand.Tyres;

public class Main {

	public static void main(String[] args) {
		makeVehicle1();
		makeVehicle2();
	}

	// No Dependency Injection...
	public static void makeVehicle1() {
		System.out.println("\n> Without Dependency Injection...");
		// We Have To Manually Create An Object For Changing The Brand Of Speakers...
		SonySpeakers sonySpeakers = new SonySpeakers();
		System.out.println(sonySpeakers.makeSound());
		// We Have To Manually Create An Object For Changing The Brand Of Tyres...
		MichelinTyres michelinTyres = new MichelinTyres();
		System.out.println(michelinTyres.rotateTyres());
	}

	// With Dependency Injection...
	public static void makeVehicle2() {
		System.out.println("\n> With Dependency Injection...");
		// Now By Just Passing/Changing An Argument We Can Change Speakers Of Any Brand...
		SpeakerFactory speakerFactory = new SpeakerFactory();
		Speakers speakers = speakerFactory.getSpeakers("SONY");
		System.out.println(speakers.makeSound());
		// Now By Just Passing/Changing An Argument We Can Change Tyres Of Any Brand...
		TyreFactory tyreFactory = new TyreFactory();
		Tyres tyres = tyreFactory.getTyres("MRF");
		System.out.println(tyres.rotateTyres());
	}

}
