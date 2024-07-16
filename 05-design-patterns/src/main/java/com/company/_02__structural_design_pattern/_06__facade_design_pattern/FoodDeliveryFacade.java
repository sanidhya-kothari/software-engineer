package com.company._02__structural_design_pattern._06__facade_design_pattern;

public class FoodDeliveryFacade {

	private Restaurant restaurant;
	private DeliveryBoy deliveryBoy;
	private DeliveryTeam deliveryTeam;
	private User user;

	public void order() {
		restaurant.placeOrder();
		deliveryTeam.assignDeliveryBoy();
		deliveryBoy.pickUpOrder();
		deliveryBoy.deliverOrder();
		user.rateService();
	}

}
