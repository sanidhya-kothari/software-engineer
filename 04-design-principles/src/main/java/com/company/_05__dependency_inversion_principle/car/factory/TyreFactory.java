package com.company._05__dependency_inversion_principle.car.factory;

import com.company._05__dependency_inversion_principle.car.model.tyres_brand.MichelinTyres;
import com.company._05__dependency_inversion_principle.car.model.tyres_brand.MrfTyres;
import com.company._05__dependency_inversion_principle.car.model.tyres_brand.Tyres;

public class TyreFactory {

	public Tyres getTyres(String tyresBrand) {
		if (tyresBrand == null) {
			return null;
		} else if (tyresBrand.equalsIgnoreCase("MICHELIN")) {
			return new MichelinTyres();
		} else if (tyresBrand.equalsIgnoreCase("MRF")) {
			return new MrfTyres();
		} else {
			return null;
		}
	}

}
