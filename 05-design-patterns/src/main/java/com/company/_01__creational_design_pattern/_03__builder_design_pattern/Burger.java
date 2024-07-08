package com.company._01__creational_design_pattern._03__builder_design_pattern;

public class Burger {

	private boolean onion;
	private boolean tomato;
	private boolean lettuce;
	private boolean paneerTikki;
	private boolean alooTikki;
	private boolean mayonese;
	private boolean cheese;

	private Burger(BurgerBuilder burgerBuilder) {
		this.onion = burgerBuilder.onion;
		this.tomato = burgerBuilder.tomato;
		this.lettuce = burgerBuilder.lettuce;
		this.paneerTikki = burgerBuilder.paneerTikki;
		this.alooTikki = burgerBuilder.alooTikki;
		this.mayonese = burgerBuilder.mayonese;
		this.cheese = burgerBuilder.cheese;
	}

	public static class BurgerBuilder {

		private boolean onion;
		private boolean tomato;
		private boolean lettuce;
		private boolean paneerTikki;
		private boolean alooTikki;
		private boolean mayonese;
		private boolean cheese;

		public Burger build() {
			return new Burger(this);
		}

		public BurgerBuilder onion(boolean onion) {
			this.onion = onion;
			return this;
		}

		public BurgerBuilder tomato(boolean tomato) {
			this.tomato = tomato;
			return this;
		}

		public BurgerBuilder lettuce(boolean lettuce) {
			this.lettuce = lettuce;
			return this;
		}

		public BurgerBuilder paneerTikki(boolean paneerTikki) {
			this.paneerTikki = paneerTikki;
			return this;
		}

		public BurgerBuilder alooTikki(boolean alooTikki) {
			this.alooTikki = alooTikki;
			return this;
		}

		public BurgerBuilder mayonese(boolean mayonese) {
			this.mayonese = mayonese;
			return this;
		}

		public BurgerBuilder cheese(boolean cheese) {
			this.cheese = cheese;
			return this;
		}

	}

	public boolean isOnion() {
		return onion;
	}

	public boolean isTomato() {
		return tomato;
	}

	public boolean isLettuce() {
		return lettuce;
	}

	public boolean isPaneerTikki() {
		return paneerTikki;
	}

	public boolean isAlooTikki() {
		return alooTikki;
	}

	public boolean isMayonese() {
		return mayonese;
	}

	public boolean isCheese() {
		return cheese;
	}

	@Override
	public String toString() {
		return "Burger -> [ onion=" + onion + ", tomato=" + tomato + ", lettuce=" + lettuce + ", paneerTikki=" + paneerTikki + ", alooTikki=" + alooTikki + ", mayonese=" + mayonese + ", cheese="
		      + cheese + " ]";
	}

}
