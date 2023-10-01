package org.example;

public enum AlcoholDrink {
		WHISKEY("Виски"),
		VODKA("Водка"),
		RUM("Ром"),
		TEQUILA("Текила"),
		GIN("Джин"),
		BEER("Пиво"),
		KOKTEYL("Прощай разум- встретимся завтра");
		private final String sort;

		AlcoholDrink(String sort) {
				this.sort = sort;
		}

		public String getName() {
				return sort;
		}
}

