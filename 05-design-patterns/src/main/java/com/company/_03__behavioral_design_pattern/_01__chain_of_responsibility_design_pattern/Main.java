package com.company._03__behavioral_design_pattern._01__chain_of_responsibility_design_pattern;

public class Main {

	public static void main(String[] args) {

		Responsibility basic = new ResponsibilityChainLevel1();
		Responsibility intermediate = new ResponsibilityChainLevel2();
		Responsibility critical = new ResponsibilityChainLevel3();
		Responsibility noSupport = new ResponsibilityChainNoSupport();

		basic.setNextResponsibility(intermediate);
		intermediate.setNextResponsibility(critical);
		critical.setNextResponsibility(noSupport);

		basic.handleResponsibility(new Request(Priority.BASIC, "how to track the shipment"));
		basic.handleResponsibility(new Request(Priority.INTERMEDIATE, "i am not able to contact to the delivery-team"));
		basic.handleResponsibility(new Request(Priority.CRITICAL, "i did not received the refund of the returned product"));
		basic.handleResponsibility(new Request(Priority.NO_SUPPORT, "how to play games"));

	}

}
